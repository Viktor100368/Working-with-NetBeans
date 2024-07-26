/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class CallableFactorial {

    private static int callableFactorial;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialC factorialC = new FactorialC(6);
        Future<Integer> future=executorService.submit(factorialC);
        try {
            callableFactorial = future.get();
        } catch (InterruptedException ex) {
            Logger.getLogger(CallableFactorial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            System.out.println(ex.getCause());
        }finally{
            executorService.shutdown();
        }
        System.out.println("factorial = "+callableFactorial);
    }

}

class FactorialC implements Callable<Integer> {

    private int f;

    FactorialC(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("vveli nepravil'noe chislo");
        }
        int result = 1;
        for (int i = result; i <= f; i++) {
            result *= i;
        }

        return result;
    }

}
