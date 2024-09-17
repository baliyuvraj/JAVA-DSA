package com.yuvraj;
import java.util.*;
public class questions{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        System.out.println(maxRange(arr,0,3));

    }
    static void swap(int[] arr,int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    static int maxElem(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }

    static int maxRange(int[] arr , int start , int end){
        int max = arr[start];
        for(int i = start ; i<=end ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;

    }
}