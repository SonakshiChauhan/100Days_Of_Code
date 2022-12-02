package com.company;

import java.util.ArrayList;

public class GFG_recursion {

        static ArrayList<Integer> increasingNumbers(int N){
            ArrayList<Integer> list = new ArrayList<>();
            if(N==1) list.add(0);
            for(int i = 1; i<=9; i++) traverse(list, N, ""+i);
            return list;
        }

        static void traverse(ArrayList<Integer> list, int N, String str){
            if(str.length()==N) list.add(Integer.parseInt(str));
            else{
                String tempString = str;
                int n = Character.getNumericValue(str.charAt(str.length()-1));
                n+=1;
                if(n<=9){
                    while(n<=9){
                        str+=n;
                        traverse(list, N, str);
                        n+=1;
                        str = tempString;
                    }
                }
            }
        }
    }

