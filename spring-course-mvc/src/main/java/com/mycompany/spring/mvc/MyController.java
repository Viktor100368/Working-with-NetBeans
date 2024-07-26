/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Victor
 */
@Controller
public class MyController {
       @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-detail-view";
    }

        @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("employee")Employee emp){
        
        return "show-emp-detail-view";     
    }
}
