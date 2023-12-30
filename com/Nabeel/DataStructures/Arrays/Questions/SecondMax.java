package com.Nabeel.DataStructures.Arrays.Questions;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,6,4,18,7,1};
        System.out.println(Arrays.toString(findFirstAndSecondMax(arr)));
    }

    public static int[] findFirstAndSecondMax(int[] nums){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        return new int[]{firstMax,secondMax};
    }
}
