package com.Nabeel.DataStructures.Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int [] arr = new int[]{3,2,4,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static void sort(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(i!= correct){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
}
