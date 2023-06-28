package com.ram.jdbc.jdbcapp012;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCount {
    public Map<Character, Integer> countFrequency(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            int count = 1;
            if (hm.containsKey(ch)) {
                count = hm.get(ch);
                count++;
            }
            hm.put(ch, count);
        }
        return hm;
    }
    public static void main(String args[]){
        FrequencyCount fc = new FrequencyCount();
        final Map<Character, Integer> result = fc.countFrequency("Mynameis rameshwar");
        System.out.println(result);
        Stream.of(1,2,3).map(i->"ram "+i).collect(Collectors.toList());
    }
}
