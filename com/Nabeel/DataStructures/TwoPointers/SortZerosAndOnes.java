package com.Nabeel.DataStructures.TwoPointers;

import java.util.Arrays;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int [] nums= new int[]{0,1,0,1,1,1,0,1,1,};
        sortTwoPointer(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void sort(int[] nums){
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[j++] = 0;
            }
        }
        while(j<nums.length){
            nums[j++] = 1;
        }
    }


    private static void sortTwoPointer(int[] nums){
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            if(nums[left] == 1 && nums[right] == 0){
                swap(nums,left,right);
                left++;
                right--;
            }
            if(nums[left] ==0){
                left++;
            }
            if(nums[right] == 1){
                right--;
            }
        }

    }


    private static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
