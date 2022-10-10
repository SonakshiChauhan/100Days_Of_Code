package com.company;

import java.util.Scanner;

public class Geek_o_nacci {
    static int find(int n,int a,int b,int c){
        if(n==3){return c;}
        if(n==2){return b;}
        if(n==1){return a;}
        return find(n-1,a,b,c)+find(n-2,a,b,c)+find(n-3,a,b,c);
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int ans=find(n,a,b,c);
            System.out.println(ans);
        }
    }
}
