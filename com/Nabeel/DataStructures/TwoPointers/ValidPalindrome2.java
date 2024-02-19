package com.Nabeel.DataStructures.TwoPointers;

class ValidPalindrome2 {

//https://leetcode.com/problems/valid-palindrome-ii/
    //This is my first appraoch for this problem
    public static void main(String[] args) {
        String s = "yd";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        if(s.length() ==1){
            return true;
        }
        else if(s.length() == 2){
            return s.charAt(0) == s.charAt(1);
        }
        else if(s.length() == 3){
            return s.charAt(0) == s.charAt(s.length() - 1) || s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2);
        }

        else{
            while(left < right){
                if(!(s.charAt(left) == s.charAt(right))){
                    if(!isPalindrome(sb.deleteCharAt(left))){
                        return isPalindrome(new StringBuilder(s).deleteCharAt(right));
                    }else{
                        return true;
                    }
                }
                left++;
                right--;
            }
        }

        return true;
    }


    private static boolean isPalindrome(StringBuilder sb){
        int left = 0;
        int right = sb.length()-1;
        while(left < right){
            if(!(sb.charAt(left)==sb.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}