/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Victor
 */
public class Test3 {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            UniLibrary ul = context.getBean("uniBean",UniLibrary.class);
            String bookName="попытка вернуть книгу не удалась";
            try{
                    bookName = ul.returnBook();
            }catch(Exception e){
                System.out.println("method ul.returnBook() throwing excepiton "+e);
            }
            System.out.println("в библиотеку вернули книгу : "+bookName);
        }
    }
}
