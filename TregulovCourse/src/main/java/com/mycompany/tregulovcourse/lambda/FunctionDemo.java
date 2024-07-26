/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.lambda;

import java.util.ArrayList;
import java.util.function.Function;

/**
 *
 * @author Victor
 */
public class FunctionDemo {
    public static double avgOfSome(ArrayList<Student> al,Function<Student,Double> f){
        double total=0;
        for(Student s:al){
            total+=f.apply(s);  
        }
        return total/al.size();
    }
    public static void main(String[] args) {
           Student st1 = new Student("Ivan",'m',22,3,8.6);
        Student st2 = new Student("Anna",'f',26,5,9.2);
        Student st3 = new Student("Anton",'m',32,4,8.1);
        Student st4 = new Student("Irina",'f',19,1,7.6);
        Student st5 = new Student("Nikolay",'m',20,2,9.0);
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        Function<Student,Double> f1 = st->(double)st.getAge();
        Function<Student,Double> f2 = st->st.getAvgGrade();
        Function<Student,Double> f3 = st->(double)st.getCourse();
        
        
        System.out.println(avgOfSome(stList,f1));
        System.out.println(avgOfSome(stList,f2));
        System.out.println(avgOfSome(stList,f3));
        System.out.println(avgOfSome(stList,el->(double)el.getCourse()));
        
    }
    
}
