/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_book.context_with_annotation_bean;

import com.mycompany.spring_book.context_with_annotation_bean.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author Victor
 */
@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot p1 = new Parrot();
        p1.setName("Semen");
        return p1;
    }

    @Bean(value = "Miki")
    @Primary
    Parrot parrot2() {
        Parrot p2 = new Parrot();
        p2.setName("Ivan");
        return p2;
    }

    @Bean
    String hello() {
        return "Hello my friend";
    }

}
