package com.yuvraj;
import java.util.*;
public class arrays2{
    public static void main(String[] args) {
        
    }
    static void array(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        
        for(int row=0 ;row<arr.length ; row++){
            for(int col = 0 ; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        for(int row = 0 ; row<arr.length ; row++){
            for(int col = 0 ; col<arr[col].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
        System.out.println();
        }   
    }

    static void colNotFixed(){
        int[][] arr = {
            {1,2,3,4},
            {1,2,},
            {7,9,8}
        };
        for(int row = 0 ; row<arr.length ; row++){
            for(int col = 0 ; col<arr[row].length ; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

  }
    


