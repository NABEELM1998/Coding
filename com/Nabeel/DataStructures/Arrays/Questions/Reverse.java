package com.Nabeel.DataStructures.Arrays.Questions;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int [] arr = new int[]{3,5,1,9,6,2};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] inputArray){
        int start = 0;
        int end = inputArray.length - 1;
        while(start < end){
            swap(inputArray,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] inputArray, int index1, int index2){
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }
}
