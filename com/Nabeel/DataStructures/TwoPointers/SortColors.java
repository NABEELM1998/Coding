package com.Nabeel.DataStructures.TwoPointers;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
    public static int[] sortColors(int[] nums) {

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroCount++;
            }
            else if(nums[i] == 1){
                oneCount++;
            }else{
                twoCount++;
            }
        }
        int[] res = new int[nums.length];
        int i=0;
        for(int j=0;j<zeroCount;j++){
            res[i++] = 0;
        }
        for(int j=0;j<oneCount;j++){
            res[i++] = 1;
        }
        for(int j=0;j<twoCount;j++){
            res[i++] = 2;
        }
    return res;
    }
}
