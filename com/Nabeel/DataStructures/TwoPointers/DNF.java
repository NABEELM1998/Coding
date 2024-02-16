package com.Nabeel.DataStructures.TwoPointers;

import java.util.Arrays;

//Dutch National Flag is used for sorting arrays with three unique elements
public class DNF {

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums){
        int low =0,mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else {
                swap(nums,mid,high);
                high--;
            }
        }

    }

    private static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
