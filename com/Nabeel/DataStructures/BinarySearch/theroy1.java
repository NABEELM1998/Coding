package com.Nabeel.DataStructures.BinarySearch;

public class theroy1 {
    public static void main(String[] args) {
        int [] arr = new int [] {1,3,5,6,8,34,78};
        System.out.println(find(arr,10));
    }
    public static int find(int [] inputArray,int target){
            int start = 0;
            int end = inputArray.length-1;
            while(start <= end){
                System.out.println("start "+start);
                System.out.println("end "+end);
                int mid = (start + end)/2;
                System.out.println("mid "+mid);
                if(inputArray[mid] > target){
                    end = mid - 1;
                } else if (inputArray[mid] < target) {
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
    }
}
