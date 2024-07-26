/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectlearning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Victor
 */
@Configuration
@ComponentScan(basePackages={"com.mycompany.projectlearning.proxies","com.mycompany.projectlearning.services",
"com.mycompany.projectlearning.repositories"})
public class ProjectConfiguration {
   
}
