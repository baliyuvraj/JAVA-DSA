package com.yuvraj;
import java.util.*;
public class javabasics{
    public static void main(String rags[]){
        arrays();
    }
    static void arrays(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int a[] : arr){
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }

    static void colNoFixed(){
        int arr[][] = {
            {1,2,3,4},
            {1,2,3},
            {1,2}
        };
        for(int row = 0 ; row<arr.length ; row++){
            for(int col=0 ; col<arr[row].length ; col++){
                System.out.print(arr[row][col]);
            }
        System.out.println();
        }
    }
}
