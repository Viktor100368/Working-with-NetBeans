/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name(e.q. java.util.Date):");
            name = scanner.next();
        }
        try {
            System.out.println("вывести имя класса и суперкласса (if!=Object)");
            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superCl != null && superCl != Object.class) {
                System.out.println(" extends " + superCl.getName());
            }
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    /**
     * Выводит все конструкторы класса
     * @param cl a class
     */
    public static void printConstructors(Class cl){
        System.out.println("Выводит все конструкторы класса");
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor c:constructors){
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0){
                System.out.print(modifiers +" ");
            }
            System.out.print(name + "(");
            //вывести типы параметров
            Class[] paramTypes = c.getParameterTypes();
            for(int i=0;i<paramTypes.length;i++){
                if(i>0){
                    System.out.print(", ");                    
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }
    /**
     * выводит все методы класса
     * @param cl a class
     */
    public static void printMethods(Class cl){
        System.out.println("выводит все методы класса");
        Method[] methods = cl.getDeclaredMethods();
        for(Method m:methods){
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length()>0){
                System.out.print(modifiers + " ");
            }
            System.out.println(retType.getName()+" "+name+ " (");
            //вывести типы параметров
            Class[] paramTypes = m.getParameterTypes();
            for(int i=0;i<paramTypes.length;i++){
                System.out.println(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }
    /**
     * Выводит все поля класса
     * @param cl a class
     */
    public static void printFields(Class cl){
        System.out.println("Выводит все поля класса");
        Field[] fields = cl.getDeclaredFields();
        for(Field f:fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length()>0){
                System.out.print(modifiers+" ");                
            }
            System.out.println(type.getName()+" "+ name+";");
        }       
    }
}
