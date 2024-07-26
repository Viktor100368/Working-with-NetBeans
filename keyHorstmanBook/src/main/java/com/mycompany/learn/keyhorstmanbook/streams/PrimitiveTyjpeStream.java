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
import java.util.Map;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.stream.IntStream;

/**
 *
 * @author Victor
 */
public class PrimitiveTyjpeStream {

    public static void show(String title, IntStream stream) {

        final int Size = 10;
        int firstElement[] = stream.limit(Size + 1).toArray();
        System.out.print(title + " : ");
        if (title.equals("str1")) {
            for (int i = 0; i < Size; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                if (i < Size) {
                    System.out.print(firstElement[i]);
                } else {
                    System.out.print("...");
                }
            }
            System.out.println();
        } else {
            for (int i = 0; i < firstElement.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                if (i < Size) {
                    System.out.print(firstElement[i]);
                } else {
                    System.out.print("...");
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        IntStream str1 = IntStream.generate(() -> (int) (Math.random() * 100));
        show("str1", str1);
        IntStream str2 = IntStream.range(5, 10);
        str2.forEach(x -> System.out.print(x + " "));
        IntStream str3 = IntStream.rangeClosed(5, 10);
        System.out.println();
        str3.forEach(x -> System.out.print(x + " "));
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Victor\\Documents\\TregulovCourse\\rubai.txt")));
        List<String> contentList = Arrays.asList(content.split("\\PL+"));
        long start = System.nanoTime();
        Map<Integer,Long> wordsCount = contentList.parallelStream().filter(x->x.length()<15)
                .collect(groupingBy(x->x.length(),counting()));
        long ends = System.nanoTime();
        System.out.println("time = "+(ends-start)/1_000_000_000.0);
        System.out.println(wordsCount);
    }
}
