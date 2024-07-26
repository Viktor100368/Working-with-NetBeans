/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.SerializationAndDeserialization.Programmer2.newpackage;


import com.mycompany.tregulovcourse.IO.SerializationAndDeserialization.Programmer1.Car;
import com.mycompany.tregulovcourse.IO.SerializationAndDeserialization.Programmer1.Employee;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class DeseriazableDemo2 {
    public static void main(String[] args) {
        Employee emp;
       // Car car;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("bestEmployee.bin"))
                ){
            emp = (Employee)inputStream.readObject();
            System.out.println(emp);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
