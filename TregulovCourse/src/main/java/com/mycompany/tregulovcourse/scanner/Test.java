/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.scanner;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;




/**
 *
 * @author Victor
 */
public class Test {
     public static void main(String[] args)  {
         int[] arr = {1,2,3,4,5,6,7,8,9};
         System.out.println(Arrays.toString(arr));
         arr=shufle(arr);
         System.out.println(Arrays.toString(arr));
    }
     public static int[] shufle(int[] a){
         int tmp = 0;
         int j=0;
         for(int i=0;i<a.length;i++){
             j= (int)(Math.random()*a.length);
             if(i==j){
                 continue;
             }
             tmp=a[i];
             a[i]=a[j];
             a[j]=tmp;
         }
         return a;
     }
}
