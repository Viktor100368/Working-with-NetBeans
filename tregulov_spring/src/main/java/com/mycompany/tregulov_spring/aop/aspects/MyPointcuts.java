/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Victor
 */
public class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    public void allGetMethods(){}
}
