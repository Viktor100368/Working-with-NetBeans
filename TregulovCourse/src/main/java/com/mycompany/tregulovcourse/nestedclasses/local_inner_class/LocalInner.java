/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.nestedclasses.local_inner_class;

/**
 *
 * @author Victor
 */
public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}
class Math{
    private int a = 10;
    
    public void getResult(){
        class Delenie{
            private int delimoe;
            private int delitel;

//            public Delenie(int delimoe, int delitel) {
//                this.delimoe = delimoe;
//                this.delitel = delitel;
//            }

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe(){
                return delimoe / delitel;
            }
            public int getOstatok(){
                System.out.println(a);
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("deleimoe = "+delenie.getDelimoe());
        System.out.println("deltel = "+delenie.getDelitel());
        System.out.println("chastnoe = "+delenie.getChastnoe());
        System.out.println("ostatok = "+delenie.getOstatok());
    }
}
