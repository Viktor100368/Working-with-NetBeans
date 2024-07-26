/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String>set = new TreeSet<>();
        try{
            scanner = new Scanner(new FileReader(new File("C:\\Users\\Victor\\Documents\\NetBeansProjects\\TregulovCourse\\test11.txt")));
            scanner.useDelimiter("\\W");
            while(scanner.hasNext()){
                String word = scanner.next();
                set.add(word);
            }
            for(String word:set){
                System.out.println(word);
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
            scanner.close();
        }
        
    
    }
}
