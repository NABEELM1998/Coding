package com.Nabeel.DataStructures.Sorting;

import java.util.ArrayList;
import java.util.List;

class FindAllMissingNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                result.add(i+1);
            }
        }
        return result;
    }


    private static void sort(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int [] nums = new int[] {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }


}