/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file.progremmer2;



import com.mycompany.learn.keyhorstmanbook.work_with_file.programmer1.Employee;
import com.mycompany.learn.keyhorstmanbook.work_with_file.programmer1.Employee1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class DeserializationEx1 {
    public static void main(String[] args) throws ClassNotFoundException {
//        List<String> listEmployees = new ArrayList<>();
//        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees1.bin"))
//                ){
//            listEmployees = (List<String>) in.readObject();
//            System.out.println("Done");
//            System.out.println(listEmployees);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DeserializationEx1.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(DeserializationEx1.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try(ObjectInputStream in =  new ObjectInputStream(new FileInputStream("BestEmployee.bin"))
                ){
            Employee1 emp = (Employee1)in.readObject();
            System.out.println(emp);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeserializationEx1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeserializationEx1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
