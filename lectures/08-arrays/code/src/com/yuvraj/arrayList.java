package com.yuvraj;
import java.util.*;
public class arrayList {
    public static void main(String args[]){
        multiDarrayList();
    }
    static void arrayList(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(32);
        // list.add(234);
        // list.add(278);
        // list.add(98);
        // list.add(567);
        // // System.out.print(list);
        // list.set(0,89);
        // list.remove(2);
        // System.out.print(list);
        
        for(int i = 0 ; i<5 ; i++){
            list.add(sc.nextInt());
        }
        System.out.print(list);

        for(int i = 0 ; i<5 ; i++){
            System.out.print(list.get(i));
        }
    }
 

    static void multiDarrayList(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i<3 ; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.print(list);

    }
}
