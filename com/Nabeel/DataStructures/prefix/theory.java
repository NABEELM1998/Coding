package com.Nabeel.DataStructures.prefix;

import java.util.Arrays;

public class theory {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,3,4,6};
        prefixSum2(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void prefixSum(int[] nums){
        int[] preffixArray = new int[nums.length];
        preffixArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preffixArray[i] = preffixArray[i-1] + nums[i];
        }
        System.out.println(Arrays.toString(preffixArray));


    }


    private static void prefixSum2(int[] nums){
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }

    }
}
