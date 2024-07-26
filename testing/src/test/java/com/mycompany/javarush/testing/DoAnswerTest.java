/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarush.testing;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Victor
 */
@ExtendWith(MockitoExtension.class)
public class DoAnswerTest {
    @Mock
    List<String> mocklist;
  
    @Test
    public void doAnswerToUpperTest(){
        mocklist.add("one");
        Mockito.verify(mocklist).add("one");
       assertEquals(0,mocklist.size());
       Mockito.doReturn("hello").when(mocklist).get(0);
        System.out.println(mocklist.get(0));
    }
}
