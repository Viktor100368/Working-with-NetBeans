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
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Victor
 */
@ExtendWith(MockitoExtension.class)
public class SpyTest {
//    @Spy
    List<String> mockList = new ArrayList<String>();
    @Test
    public void whenMockAnnotation(){
        mockList.add("one");
        mockList.add("two");
        
    }
    
}
