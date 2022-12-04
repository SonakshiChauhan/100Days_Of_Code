package com.company;


    import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class power_sumproblem {

        /*
         * Complete the 'powerSum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER X
         *  2. INTEGER N
         */


        public static int powerSum(int X, int N) {
            return powerSum(X, N, 1);
        }
        public static int powerSum(int X, int N, int start) {
            int res=X-(int)Math.pow(start,N);
            if(res==0){return 1;}
            if(res<0){return 0;}
            return powerSum(res,N,start+1)+powerSum(X, N,start+1);
        }

    }

