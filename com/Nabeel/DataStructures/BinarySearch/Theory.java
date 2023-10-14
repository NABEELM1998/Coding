package com.Nabeel.DataStructures.BinarySearch;

import java.util.Arrays;

public class Theory {
    public static void main(String[] args) {
        int [] arr = new int[] {5,7,3,9,2,3,4};
        System.out.println(find(arr,3));

    }

    public static int find(int []inputArray, int target){
        Arrays.sort(inputArray);
        int start = 0;
        int end = inputArray.length-1;

//        for (int i = start; i <= end ; i++) {
//
//            int mid = (start + end)/2;
//            if(target < inputArray[mid]){
//                end = mid -1;
////            } else if (target > inputArray[mid]) {
////                start = mid+1;
////            }
////            else {
////                return mid;
////            }
////        }
//        return -1;

        while (start <= end){

            int mid = (start + end)/2;
            if(target < inputArray[mid]){
                end = mid -1;
            } else if (target > inputArray[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return  -1;
    }
}
