package com.Nabeel.DataStructures.TwoPointers;

class ValidPalindrome4 {

    public static void main(String[] args) {
        System.out.println(validPalindrome("akaj"));
    }
    public static boolean validPalindrome(String s) {
       int left = 0;
       int right = s.length()-1;
       return isPalindrome(s,left,right,false);
    }

    private static boolean isPalindrome(String s,int left,int right,boolean isDeleted){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                if(isDeleted){
                    return false;
                }
                return isPalindrome(s,left+1,right,true) || isPalindrome(s,left,right-1,true);
            }
            left++;
            right--;
        }
        return true;


    }


    
}