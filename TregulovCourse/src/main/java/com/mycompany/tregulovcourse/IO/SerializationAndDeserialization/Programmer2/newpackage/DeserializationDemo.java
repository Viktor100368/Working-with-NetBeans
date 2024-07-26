/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.SerializationAndDeserialization.Programmer2.newpackage;

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
public class DeserializationDemo {
    public static void main(String[] args) {
        List<String> objectList;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))
                ){
            objectList =(ArrayList) inputStream.readObject();
            System.out.println(objectList);
            System.out.println("done!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
