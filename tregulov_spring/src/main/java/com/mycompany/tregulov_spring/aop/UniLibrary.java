/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop;

import com.mycompany.tregulov_spring.aop.aspects.AbstractLibrary;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component("uniBean")
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("Мы берем книгу в университете");
        System.out.println("==============================");
    }
    public String returnBook(){
        int a = 10/0;
        System.out.println("мы возвращаем книгу в университет");
        //System.out.println("=-==============================");
        return "world and pice";
    }
    public void getMagazin(int a){
        System.out.println("мы берем журнал № "+a+" в университете");
        System.out.println("==========================================");
    }
    
    public void returnMagazin(){
        System.out.println("мы возврашаем журнал в университет");
        System.out.println("=====================================");
    }
    
    public void addBook(String personName,Book book){
        System.out.println("мы добавили книгу в университет");
        System.out.println("==================================");
    }
    
    public void addMagazin(){
        System.out.println("мы добавили журнал в университет");
    }
}
