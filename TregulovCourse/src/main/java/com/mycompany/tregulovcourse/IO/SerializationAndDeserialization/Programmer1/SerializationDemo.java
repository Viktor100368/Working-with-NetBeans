/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.SerializationAndDeserialization.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class SerializationDemo {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Ivan");
        employees.add("Anton");
        employees.add("Marija");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))
                ){
            outputStream.writeObject(employees);
            System.out.println("done!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
    }
    
}
