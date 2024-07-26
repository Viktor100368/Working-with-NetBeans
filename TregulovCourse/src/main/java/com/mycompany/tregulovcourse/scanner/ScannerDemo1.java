/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.scanner;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite chislo");
        int chislo=scanner.nextInt();
        System.out.println(chislo+"\n===========================");
        System.out.println("vvedite 2 chisla");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("chastnoe "+x+" and "+y+" = "+x/y);
        System.out.println("ostatok = "+x%y);
        scanner.close();
    }
            
    
}
