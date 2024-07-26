/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarush.testing;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Victor
 */
public class CalculatorTest {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorTest.class);

    Calculator calc;

    @BeforeEach
    public void initEach() {
        calc = new Calculator();
    }

    @DisplayName("method add")
    @Test
    public void add() {
        System.out.println("test add");
        int res = calc.add(4, 6);
        assertEquals(10, res);
    }

    //@Disabled("test sub off")
    @Test
    public void sub() {

        System.out.println("test sub");
        int res = calc.sub(10, 7);
        assertEquals(3, res);
    }
    // @Disabled
    // @ParameterizedTest
    //@ValueSource(ints={1,4,0})

    @Test
    //@Timeout(value = 2,unit=TimeUnit.MILLISECONDS)
    public void div() {
        LocalDateTime dt = LocalDateTime.now();
        logger.debug("Test div checkout time working {}", dt);
        int a = 25, b = 5;
        System.out.println("test div");
        int res = calc.div(a, b);
        assertEquals(5, res);
        LocalDateTime dt1 = LocalDateTime.now();
        logger.info("Test div after working {}",dt1);
    }

    @Test
    public void mul() {
        System.out.println("test mul");
        int res = calc.mul(8, 9);
        assertEquals(72, res);
    }

}
