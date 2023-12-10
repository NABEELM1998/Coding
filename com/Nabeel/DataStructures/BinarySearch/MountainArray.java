package com.Nabeel.DataStructures.BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int [] arr  = new int[]{1,2,3,5,7,8,6,3,2};
        System.out.println(findPeakElement(arr));
        
    }
    public static int findPeakElement(int []arr){
        int start =0;
        int end = arr.length -1;
       while(start < end){
        int mid = (start+end)/2;
        if(arr[mid]>arr[mid+1]){
            end = mid;
        }
        else {
            start = mid+1;
        }
       }
       return start;
    }
}
