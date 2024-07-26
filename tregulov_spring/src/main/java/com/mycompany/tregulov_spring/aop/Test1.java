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
public class Test1 {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            Book book = context.getBean("book",Book.class);
            UniLibrary ul = context.getBean("uniLibrary",UniLibrary.class);
            ul.addBook("Victor", book);
            ul.getBook();
            ul.addMagazin();
//            ul.getMagazin(10);
            ul.returnBook();
//            ul.getBookAgain("Преступление и наказание");
//            ScoolLibrary sl = context.getBean("scoolLibrary",ScoolLibrary.class);
//            sl.getBook();
//            Book book = context.getBean("book",Book.class);
//            ul.getBook2(book);
        }
    }
}
