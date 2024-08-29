package com.yuvraj;

import java.util.*;
public class xyz{
    public static void main(String args[]){
        // array1();
        // array2();
        MultiD();

    }
    static void array1(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(Arrays.toString(arr));
    }

    static void array2(){
        //array of objects
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for(int i = 0 ; i<str.length ; i++){
            str[i] = sc.next();
        }
        System.out.print(Arrays.toString(str));
    }
    static void MultiD(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //for input
        for(int row = 0 ; row<arr.length ; row++){
            for(int col = 0 ; col<arr.length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //for output
        // for(int row = 0 ; row<arr.length ; row++){
        //     for(int col = 0 ; col<arr.length ; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        //2-
        // for(int row= 0 ; row<arr.length ; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        //3-

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
