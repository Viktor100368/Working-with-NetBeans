/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.Generics;

/**
 *
 * @author Victor
 */
public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Hello",44);
        System.out.println("value1 = "+pair.getValue1()+" value2 = "+pair.getValue2());
    }
    
   
}
class Pair<V1,V2>{
    private V1 value1;
    private V2 value2;
    public Pair(V1 value1,V2 value2){
        this.value1 = value1;
        this.value2 =value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
    
}
