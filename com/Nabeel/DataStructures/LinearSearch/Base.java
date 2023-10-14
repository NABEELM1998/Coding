package com.Nabeel.DataStructures.LinearSearch;

public class Base {

    public static void main(String[] args) {
        int [] arr = new int[]{2,4,6,7,9,3,78};
        int [][] arr2 = new int[][]{
                {2,4},
                {8,16}
        };
//        System.out.println(find(arr,7));
          System.out.println(find(arr2,16));

    }

    public static int find(int[] inputArray, int element){
        if (inputArray.length == 0){
            return -1;
        }
        int i = 0;
        while(i < inputArray.length){
            if(inputArray[i] == element){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int find(int[][] inputArray,int target){
        if (inputArray.length == 0){
            return  -1;
        }
        for (int row = 0;row<inputArray.length;row++){
            for (int col = 0;col<inputArray[row].length; col++){
                if(inputArray[row][col] == target){
                    return row;
                }
            }

        }
        return -1;
    }
}
