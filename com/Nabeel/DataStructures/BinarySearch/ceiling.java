package com.Nabeel.DataStructures.BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int [] arr = new int[] {1,3,5,9,12,15,16};
        System.out.println(ceiling(arr,25));
    }
    //smallest element that is greater than or equal to the target
    public static int ceiling(int[] inputArray, int target){

        int start = 0;
        int end = inputArray.length-1;
        if(target > inputArray[inputArray.length-1]){
            return -1;
        }

        while (start <= end){
            System.out.println("start "+start);
            System.out.println("end "+end);
            int mid = (start+end)/2;
            System.out.println("mid "+mid);
            if(inputArray[mid] > target){
                end = mid-1;
            } else if (inputArray[mid] < target) {
                start = mid + 1;
            }
            else {
                return inputArray[mid];
            }
        }
        return inputArray[start];
    }
}
