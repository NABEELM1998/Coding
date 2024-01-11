package com.Nabeel.DataStructures.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = new int[] {9,7,199,-1,4,6,5,1,23};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;///the portion on the left will be sorted already
                }
            }
        }
    }

    private static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
