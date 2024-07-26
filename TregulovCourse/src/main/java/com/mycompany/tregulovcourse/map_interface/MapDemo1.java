/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.map_interface;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Victor
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(10003, "Ivan Ivanov");
        map.put(10234, "Anna Petrova");
        map.put(54303, "Semen Semenov");
        map.put(456703, "Irina Ivanova");
        map.put(16363, "Anton Antonov");
        System.out.println(map);
        map.putIfAbsent(10003, "Stepan Stepanov");
        System.out.println(map);
        map.remove(10234);
        System.out.println(map);
        boolean ifContains = map.containsValue("Ivan Ivanov");
        System.out.println("contains = "+ifContains);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
