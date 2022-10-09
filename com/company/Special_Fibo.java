package com.company;

import java.util.Scanner;

public class Special_Fibo {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=0;x<n;x++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int temp=0;
            if(c%3==0){temp=a;}
            else if(c%3==1){temp=b;}
            else temp=a^b;
            System.out.println(temp);
        }
    }
}
