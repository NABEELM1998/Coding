package com.Nabeel.DataStructures.BinarySearch;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
                {1,4,5},{2,3,5}
        };
        search(arr,3);

    }
    public static void search(int [][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
}
