package com.Nabeel.DataStructures.BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,8,10,12,14,19};
        System.out.println(floor(arr,0));

    }
    //greatest element that is smaller than or equal to target
    public static int floor(int[] inputArray,int target){
        if(inputArray[0] > target){
            return -1;
        }
        int start = 0;
        int end = inputArray.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(inputArray[mid]>target){
                end = mid-1;
            } else if (inputArray[mid] < target) {
                start = mid+1;
            }
            else {
                return inputArray[mid];
            }

        }
        return inputArray[end];
    }
}
