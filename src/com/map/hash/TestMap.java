package com.map.hash;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args){
        Map<Character, Integer> charMap = new HashMap<>();

        String name = "rajesh shrestha";
        char[] chars = name.toCharArray();
        //System.out.println(chars)

        for(char c: chars) {
            if (charMap.containsKey(c)) {
                int newValue = charMap.get(c) + 1;
                charMap.put(c, newValue);
            } else {
                charMap.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> e : charMap.entrySet()){
            System.out.println(e.getKey() + "---------" + e.getValue());
        }
        }
    }

