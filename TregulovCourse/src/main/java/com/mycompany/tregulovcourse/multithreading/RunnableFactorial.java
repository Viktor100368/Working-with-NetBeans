/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Victor
 */
public class RunnableFactorial {
    public static int factorialResult;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
        service.execute(factorial);
        service.shutdown();
        try {
            service.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
              System.out.println("factorial =  "+factorialResult);

    }

}

class Factorial implements Runnable {

    private int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        
        if (f <= 0) {
            System.out.println("Ввели неправильное число");
            return;
        }
            int result =1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            RunnableFactorial.factorialResult = result;
        

    }
}
