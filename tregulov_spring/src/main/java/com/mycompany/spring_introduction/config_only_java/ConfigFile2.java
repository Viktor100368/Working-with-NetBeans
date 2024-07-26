/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction.config_only_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Victor
 */
@Configuration
@PropertySource("classpath:myApp.properties")
public class ConfigFile2 {
    @Bean
    Pet catBean(){
        return new Cat2();
        
    }
    @Bean
    Person2 person(){
        return new Person2(catBean());
        
    }
}
