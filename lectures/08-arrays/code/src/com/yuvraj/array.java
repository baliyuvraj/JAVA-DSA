package com.yuvraj;
import java.util.*;
public class array{
    public static void main(String[] args) {
        array();
    }
    static void array(){
        Scanner sc = new Scanner(System.in);
        System.out.print
        ("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        //for input
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //for output
        System.out.println("the multidimentional array is : ");
        for(int[] row : arr){
            System.out.print(Arrays.toString(row));
            System.out.println();
        }
    }


}
