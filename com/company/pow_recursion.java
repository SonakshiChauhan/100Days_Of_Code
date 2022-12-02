package com.company;
/*
Runtime:0ms
Space: 41.5 MB
 */
public class pow_recursion {

        public double myPow(double p, int n) {
            if(n==0){return 1.0;}
            double x = myPow(p,n/2);

            if(n%2 == 0)
                return  x * x;
            else if(n%2 == 1)
                return  x * x * p;
            else {
                return 1/myPow(p,-n);
            }

        }

}
