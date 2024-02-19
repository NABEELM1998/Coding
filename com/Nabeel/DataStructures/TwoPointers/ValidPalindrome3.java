package com.Nabeel.DataStructures.TwoPointers;

class ValidPalindrome3 {
    //https://leetcode.com/problems/valid-palindrome-ii/
    //this approach uses 4ms runtime,

    public static void main(String[] args) {
        System.out.println(validPalindrome("abcoiba"));
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        if(s.length() == 1 || s.length() ==2){
            return true;
        }
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
       
    }


    private static boolean isPalindrome(String s,int left,int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}