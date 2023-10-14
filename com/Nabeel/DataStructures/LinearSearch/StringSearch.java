package com.Nabeel.DataStructures.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Nabeel";
        System.out.println(isPresent(name,'r'));
    }

    public static boolean isPresent(String input, char target){
        if(input.length() == 0){
            return false;
        }
        for(int i=0;i < input.length(); i++){
            if(input.charAt(i) == target){
                return true;
            }

        }
        return false;
    }
}
