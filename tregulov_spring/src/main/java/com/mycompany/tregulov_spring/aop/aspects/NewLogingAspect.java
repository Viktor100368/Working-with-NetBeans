/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
@Aspect
public class NewLogingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLogingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("aroundReturnBookLogingAspect: в библиотеку пытаются возвратить книгу");
       // long starts = System.currentTimeMillis();
        Object targetMethodResult =null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLogingAspect: выбросил исключение  "+e);
            throw e;
        }
       // long ends = System.currentTimeMillis();
        System.out.println("aroundReturnBookLogingAspect: в библиотеку возврашают книгу");
        //System.out.println("tiime = "+(ends-starts));
        return targetMethodResult;
    }
}
