/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file.programmer1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class SerializationEx1 {
    public static void main(String[] args) {
//        List<String> employees = new ArrayList<>();
//        employees.add("Ivan");
//        employees.add("Anton");
//        employees.add("Elena");
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees1.bin"))){
//            out.writeObject(employees);
//            System.out.println("Done!");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(SerializationEx1.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(SerializationEx1.class.getName()).log(Level.SEVERE, null, ex);
//        }

        Car car = new Car("vaz 2111","black");
        Employee1 emp1 = new Employee1("Ivan","Petrov",30,"deliver",car);
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("BestEmployee.bin"))
                ){
            out.writeObject(emp1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializationEx1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializationEx1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
