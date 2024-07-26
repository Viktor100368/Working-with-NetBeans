/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop.aspects;

import com.mycompany.tregulov_spring.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.mycompany.tregulov_spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = "+methodSignature);
        System.out.println("methodSignature.getMethod = "+ methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName = "+ methodSignature.getName());
        
        if(methodSignature.getName().equals("addBook")){
            Object[] args= joinPoint.getArgs();
            for(Object ob:args){
                if(ob instanceof Book){
                    Book book = (Book)ob;
                    System.out.println("information for book: name is "+book.getName());
                    System.out.println("information for book: author is "+ book.getAuthor());
                    System.out.println("information for book: yearOfPublisher is "+book.getYearOfPublication());
                }
                else if(ob instanceof String){
                    System.out.println("information on Person, book added a "+ob);
            }
            }
        }
        
        
        
        
        
        
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
        System.out.println("-------------------------------");
    }

//    
//    @Before("execution( * ret*())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }
//    
//    @Before("execution(* *(*))")
//    public void beforeGetBookAgain(){
//        System.out.println("beforeGetBookAgain: попытка получить книгу по названию");
//    }
//    @Before("execution( void getBook2(com.mycompany.tregulov_spring.aop.Book))")
//    public void beforeGetBook2(){
//        System.out.println("beforeGetBook2: попытка получить книгу по имени класса");
//    }
}
