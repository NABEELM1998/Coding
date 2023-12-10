package com.Nabeel.DataStructures.BinarySearch;

public class RBS {
    public static void main(String[] args) {
    int [] arr = new int[]{4,5,6,7,9,0,1,2};
    int target = 1;
        System.out.println(search(arr,target));
    }
    public static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (arr[mid]<arr[start]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static  int BinarySearch(int []arr,int start, int end,int target){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static int search(int[] arr,int target){
        int pivot = findPivot(arr);
        if(target == arr[pivot]){
            return pivot;
        } else if (target>arr[0]) {
            return BinarySearch(arr,0,pivot,target);
        }
        else {
            return BinarySearch(arr,pivot,arr.length-1,target);
        }
    }
}
