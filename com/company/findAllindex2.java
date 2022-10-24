package com.company;

import java.util.ArrayList;

/*
This program is to explain an important concept of fuction calls
 */
public class findAllindex2 {
    static ArrayList<Integer> findallindex2(int[] arr, int target, int index){
       ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls= findallindex2(arr,target,index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
