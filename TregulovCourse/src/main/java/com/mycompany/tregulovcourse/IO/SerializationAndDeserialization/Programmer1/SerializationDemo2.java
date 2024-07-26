/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.SerializationAndDeserialization.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class SerializationDemo2 {
    public static void main(String[] args) {
        Car car = new Car("Vaz","black");
        Employee employee = new Employee("Ivan","IT",30,600,car);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("bestEmployee.bin"))
                ){
            outputStream.writeObject(employee);
            System.out.println("done!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
    }
    
}
