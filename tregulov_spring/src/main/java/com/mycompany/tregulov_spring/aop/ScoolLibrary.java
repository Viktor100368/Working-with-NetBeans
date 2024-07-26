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
@Component
public class ScoolLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу в школе");
    }
    
}
