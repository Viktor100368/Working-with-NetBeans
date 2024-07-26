/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
@Aspect
@Order(3)
public class ExceptionAspect {
   @Before("com.mycompany.tregulov_spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeExceptionAdvice() {
        System.out.println("beforeExceptionAdvice: ловим исключения ");
        System.out.println("------------------------------------");
    }
    
}
