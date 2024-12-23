package com.yuvraj;
import java.util.*;
public class arrayList{
    public static void main(String args[]){
        int[] arr = {1,3,45,67,89,12};
        System.out.println(Arrays.toString(arr));
        System.out.println("max elem is : " + maxElem(arr));
        
    }

    static void arrayList1(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        System.out.println("enter elements");
        for(int i = 0 ; i < 10 ; i++){
            list.add(sc.nextInt());
        }
    }

    static void arrayList2(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("enter elements : ");
        for(int i = 0 ; i < 3 ; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }

    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp ;
    }

    static int maxElem(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length  ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    

}



