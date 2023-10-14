package com.Nabeel.DataStructures.LinearSearch;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] balances = new int [][]{
                {134,56,78},{50,45,96},{400,5,1}
        };

        int [] totalBalance = new int[balances.length];
        for(int row =0;row<balances.length;row++){
            int sum=0;
            for (int col =0; col < balances[row].length;col++){
                    sum+=balances[row][col];
            }
            totalBalance[row] = sum;
        }
        int max = totalBalance[0];
        for (int i = 0; i < totalBalance.length; i++) {
            if(totalBalance[i] > max){
                max = totalBalance[i];
            }
        }

        System.out.println(max);
    }
}
