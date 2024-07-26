/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.streams;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
/**
 *
 * @author Victor
 */
public class CollectingResult {

    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("C:\\Users\\Victor\\Documents\\TregulovCourse\\rubai.txt")));        
        List<String> wordlist = Arrays.asList(contents.split("\\PL+"));
        System.out.println(wordlist);  
        List<String> outlist=wordlist.stream().map(x->x.replaceAll("[аеоуюя]", "_")).toList();
        System.out.println(outlist);
        
        IntStream stream = IntStream.of(1,3,4,5,6,7,8,9);
        int[] arr = stream.toArray();
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        //int[]array= stream.map(x->x*2).filter(x->x%3==0).toArray();
        int[]array= Arrays.stream(arr2).map(x->x*2).filter(x->x%3==0).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        
    }
}
