package com.Nabeel.DataStructures.Arrays.model;

import com.Nabeel.DataStructures.Arrays.model.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args){
//        int [] arr = new int[]{2,3,4,5,6,7};
//        System.out.println(Arrays.toString(arr));

        Employee [] employees = new Employee[]{new Employee(1,"Nabeel",100),new Employee(2,"sachin",3000)};
//        System.out.println(Arrays.toString(employees));

        for(int i =0; i<employees.length;i++){
            System.out.println(employees[i]);
        }

        int [] [] arr2 = new int [3][2];
        System.out.println(arr2.length); //give number of rows
        System.out.println(arr2[0].length); //give number of elements in each row

        Scanner sc = new Scanner(System.in);

        for(int row =0; row<arr2.length; row++){
            for(int col =0; col < arr2[row].length; col++){
                arr2[row][col] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }

        }
        for (int i = 0; i < arr2.length; i++) {

                System.out.println(Arrays.toString(arr2[i]));


        }



    }
}
