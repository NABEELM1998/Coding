package com.Nabeel.DataStructures.Arrays.Questions;

public class Max {

    public static void main(String[] args) {
        int [] arr = new int[]{10,85,42,36,200,1,112};
        System.out.println(max(arr));

    }

    public static int max(int [] inputArray){
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] > max){
                max = inputArray[i];
            }
        }
        return  max;
    }
}
