package com.Nabeel.DataStructures.Strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurence {
    public static void main(String[] args) {
        String s = "java is awesome";
        System.out.println(findMaxOccurringChar(s));
    }

    public static char findMaxOccurringChar(String s){
        Map<Character,Integer> countMap  = new HashMap<>();
        int count = 0;
        char result =0;
        for(int i=0;i<s.length();i++){
            if(countMap.containsKey(s.charAt(i))){
                countMap.put(s.charAt(i),countMap.get(s.charAt(i))+1);
            }
            else {
                countMap.put(s.charAt(i),1);
            }
            if(countMap.get(s.charAt(i)) > count){
                count = countMap.get(s.charAt(i));
                result = s.charAt(i);
            }
        }
        return result;
    }
}
