package com.Nabeel.DataStructures.BinarySearch;

public class SearchMountainArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,5,7,3,2,1};
        System.out.println(search(arr,5));


    }

    public static int search(int []arr,int target){
        int peak = findPeakElement(arr);
        int firstTry = orderAgnoisticBS(arr,0,peak,target);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnoisticBS(arr,peak,arr.length-1,target);
    }
    public static int findPeakElement(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    public static int orderAgnoisticBS(int[]arr,int start,int end,int target){

        while (start<=end){
            int mid = (start+end)/2;
            boolean isAcs = arr[start]<arr[end];
            if(arr[mid] == target){
                return mid;
            }
            if(isAcs){
                if(arr[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else {
                if(arr[mid]>target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

        }
        return -1;
    }
}
