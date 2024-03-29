package com.Nabeel.DataStructures.Sorting;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int [] nums = new int[]{1,3,4,2,5,5};
        System.out.println(findDuplicate(nums));

    }

    private static int findDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != i+1){
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    private static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
