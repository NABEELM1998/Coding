package com.Nabeel.DataStructures.Sorting;

import java.util.Arrays;

class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    result[0] = nums[i];
                    result[1] = nums[i] + 1;
                    return result;
                }

            } else {
                i++;
            }
        }
        return result;

    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8, 7, 3, 5, 3, 6, 1, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

}