package com.Nabeel.DataStructures.Arrays.Questions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr = new int [] {1,3,9,4,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int [] inputArray, int index1,int index2){
//        int firstElement = inputArray[index1];
//        int secondElement = inputArray[index2];
//        inputArray[index1] = secondElement;
//        inputArray[index2] = firstElement;
//
        //better solution
        System.out.println(index1+"___"+index2);
        //handling the edge case
        if(index1 > index2){
            return;
        }
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }

    public static void reverse(int [] inputArray){
//        for (int i =0;i<inputArray.length;i++){
//            swap(inputArray,i,inputArray.length-1-i);
//
//        }
        int start = 0;
        int end = inputArray.length-1;
        while (start<end){
            swap(inputArray,start,end);
            start++;
            end--;
        }
    }
}
