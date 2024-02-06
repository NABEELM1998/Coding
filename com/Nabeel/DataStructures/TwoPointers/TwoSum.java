package com.Nabeel.DataStructures.TwoPointers;

import java.util.Arrays;

public class TwoSum {
    //This will work only for sorted arrays
    public static void main(String[] args) {
        int[] nums = new int[]{3,6,9,13,15,19,21};
        System.out.println(Arrays.toString(twoSm(nums,10)));


    }
    private static int[] twoSm(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[] {left,right};
            } else if (sum < target) {
                left++;
            }else {
                right--;
            }

        }
        return new int[]{-1,-1};

    }
}
