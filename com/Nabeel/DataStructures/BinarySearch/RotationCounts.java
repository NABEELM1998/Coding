package com.Nabeel.DataStructures.BinarySearch;

public class RotationCounts {
    public static void main(String[] args) {
        int[] arr = new int[]{10,11,1,5,7,9};
        System.out.println(findCount(arr));
    }

    public static int findCount(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            } else if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1+1;
            } else if (arr[mid]<arr[start]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

}
