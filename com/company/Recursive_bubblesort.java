package com.company;
import java.util.Arrays;
public class Recursive_bubblesort {
    static void bubbleSort(int[] ar,int n) {
        if (n == 1) {
            return;
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] > ar[i + 1]) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
                count = count + 1;
            }
        }
            if (count == 0) {
                return;
            }
            bubbleSort(ar, n - 1);

    }
        public static void main(String[] args){

            int arr[]={64,34,25,12,32,11,90};
            bubbleSort(arr,arr.length);
            System.out.println("Sorted array : ");
            System.out.println(Arrays.toString(arr));
        }
    }

