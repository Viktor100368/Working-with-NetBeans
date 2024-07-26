/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.lambda;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class StudentInfo {
    void testStudents(ArrayList<Student> al,StudentChecks sch){
        for(Student s:al){
            if(sch.check(s)){
                System.out.println(s);
            }
        }
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
//        StudentInfo info = new StudentInfo();
//        info.printStudentsMixCondition(stList, 25, 8.0, 'm');
//        info.printStudentsOverGrade(stList, 8.0);
//        info.printStudentsUnderAge(stList, 25);  

            StudentInfo sf = new StudentInfo();
            sf.testStudents(stList, new OverGrade());
    }
//       void printStudentsOverGrade(ArrayList<Student> al,double grade){
//        for(Student s:al){
//            if(s.getAvgGrade()>= grade){
//                System.out.println(s);
//            }
//        }
//           System.out.println("=============================");
//    }
//        void printStudentsMixCondition(ArrayList<Student> al,int age,double grade,char sex){
//            for(Student s:al){
//                if(s.getAge()>=age && s.getAvgGrade()>grade && s.getSex()==sex){
//                    System.out.println(s);
//                }
//            } 
//            System.out.println("================================");
//    } 
//        void printStudentsUnderAge(ArrayList<Student> al,int age){
//            for(Student s:al){
//                if(s.getAge()<age){
//                    System.out.println(s);
//                }
//            }
//            System.out.println("==============================");
//    }
}
interface StudentChecks{
    boolean check(Student s);
}
//--------------------------------
class OverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.getAvgGrade()>8.5;
    }
    
}    
