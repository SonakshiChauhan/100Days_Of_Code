package com.company;

public class selectionsort {

    static void selection(int[] arr,int r,int c,int max){
        if(r==0){return;}
        if(c<r){
            if(arr[c]>arr[max]){
               selection(arr,r,c+1,c);
            }
            else{
                selection(arr,r,c+1,max);
            }


        }
        else{
            System.out.println();
            int temp=arr[max];
            arr[r-1]=arr[max];
            arr[max]=temp;
            selection(arr,r-1,0,max);


        }
    }
}
