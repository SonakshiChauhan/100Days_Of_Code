package com.company;
/*
Runtime-0.62 ms
 */
public class One_to_N_without_loop {

    public void printNos(int N)
    {
        if(N==0){return;}
        printNos(N-1);
        System.out.print(N+" ");
    }
}
