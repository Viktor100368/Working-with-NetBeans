/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarush.testing;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Victor
 */
@ExtendWith(MockitoExtension.class)
public class MockTest {
 @Mock
 List mocklist;
    
       @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        Mockito.doReturn("hello dolly").when(mocklist).get(anyInt()); 
      Mockito.doReturn(10).when(mocklist).size();
      Mockito.when(mocklist.get(0)).thenReturn("one");
      Mockito.doReturn("Two").when(mocklist).get(1);
     // Mockito.when(mocklist.get(2)).thenThrow(IllegalStateException.class);
     
    Mockito.doReturn("Ivan").when(mocklist).get(100);
      Mockito.doReturn("Marija").when(mocklist).get(5000);
      Mockito.when(mocklist.get(5100)).thenReturn("Marija + Ivan");
     
           System.out.println(mocklist.get(0));
           System.out.println(mocklist.size());
           System.out.println(mocklist.get(1));
           //System.out.println(mocklist.get(2));
           System.out.println(mocklist.get(100));
           System.out.println(mocklist.get(5000));
           System.out.println(mocklist.get(5100));
        String str = (String) mocklist.get(2);
        Mockito.verify(mocklist).get(2);
    }
}
