package com.company;
import java.io.*;
import java.util.*;
public class Sum_of_didgits_ofA_NUmberusing_recursion {
    static int sum_of_digit(int n){
        if(n==0){
            return 0;

        }
        return (n%10+sum_of_digit(n/10));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=sum_of_digit(n);
        System.out.println(result);
    }
}
