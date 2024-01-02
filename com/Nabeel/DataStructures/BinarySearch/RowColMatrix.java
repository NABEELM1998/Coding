package com.Nabeel.DataStructures.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,33},{20,40,60}
        };
        System.out.println(Arrays.toString(search(arr,33)));
    }


    public static int [] search(int [][] matrix,int target){
        int r = 0;
        int c = 3-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int []{r,c};
            } else if (matrix[r][c]>target) {
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
