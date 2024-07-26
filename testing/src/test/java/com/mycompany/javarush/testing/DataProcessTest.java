/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarush.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Victor
 */
//@ExtendWith(MockitoExtension.class)
@ExtendWith(MockitoExtension.class)
public class DataProcessTest {

    @Test
    public void testProcessData() {
        DataService mockDataService = Mockito.mock(DataService.class);
        Mockito.when(mockDataService.returnData()).thenReturn(22.0);
        DataCompute compute = new DataCompute(mockDataService);
        double res = compute.processCompute();
        assertEquals(44.0,res,0.01);

    }
}
