package com.Nabeel.DataStructures.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,9,8,7};
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = maxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
        System.out.println(Arrays.toString(arr));

    }

    private static int maxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[]arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
