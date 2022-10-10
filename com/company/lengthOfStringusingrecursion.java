package com.company;
import java.util.*;
public class lengthOfStringusingrecursion {
    private static int reclen(String str){
        if(str.equals("")){
            return 0;
        }
        else{
            return reclen(str.substring(1))+1;
        }
    }
    public static void main(String args[]){
        String str="SonakshiChauhan";
        System.out.println(reclen(str));
    }
}
