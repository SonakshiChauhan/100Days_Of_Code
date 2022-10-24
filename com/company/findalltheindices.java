package com.company;

import java.util.ArrayList;

public class findalltheindices {
    public static void main(String args[]){
    int[] arr={1,2,3,4,4,7};
    findIndex(arr,4,0);
    System.out.println(list);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
         findIndex(arr,target,index+1);

    }
}
