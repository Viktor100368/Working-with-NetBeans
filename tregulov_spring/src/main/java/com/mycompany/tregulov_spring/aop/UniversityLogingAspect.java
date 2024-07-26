/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop;

import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
@Aspect
public class UniversityLogingAspect {
//    @Before("execution(* getStudent())")
//    public void beforeGetStudnetLogingAdvice(){
//        System.out.println("beforeGetStudnetLogingAdvice: логируем получение"
//                + "списка студентов перед методом getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudent())",
//            returning = "students")
//    public void afterReturningGetStudnetLogingAdvice(List<Student> students){
//        Student student0 = students.get(0);
//        String nameStudent = student0.getNameSurname();
//        int courseNumber = student0.getCourse();
//        double avgGradeValue = student0.getAvggrade();
//        nameStudent = "Mr "+nameStudent;
//        courseNumber = courseNumber*2;
//        avgGradeValue = avgGradeValue + 5;
//        student0.setNameSurname(nameStudent);
//        student0.setAvggrade(avgGradeValue);
//        student0.setCourse(courseNumber);        
//        System.out.println("afterReturningGetStudnetLogingAdvice: логируем получение"
//                + "списка студентов после работы метода getStudents");
//    }
    /*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    @AfterThrowing(pointcut  = "execution(* getStudent())",
            throwing = "exception")
    public void afterReturningGetStudnetLogingAdvice(JoinPoint joinPoint,Throwable exception){
        System.out.println(joinPoint.getSignature());
        
        System.out.println("логирует выброс исключения "+exception);
    }
    
    
    @After("execution(* getStudent())")
    public void afterGetStudnetLogingAdvice(){
        System.out.println("method getStudent завершен");
    }
}
