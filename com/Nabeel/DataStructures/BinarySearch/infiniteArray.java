package com.Nabeel.DataStructures.BinarySearch;

public class infiniteArray {

    public static void main(String[] args) {
        int start = 0;
        int end =1;
        int [] arr = new int[]{1,3,5,6,7,8,90,100};
        int target = 8;
        while(target>arr[end]){
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        System.out.println(search(start,end,arr,8));
    }

    public static int search(int start,int end,int[] nums,int target){
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] > target){
                end = mid-1;
            }
            else if (nums[mid]<target){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
