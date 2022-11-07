package com.company;
/*
Runtime: 2ms
Space: 41.5 MB
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1){return true;}
        if(n==0){return false;}
        return n % 2 == 0 && isPowerOfTwo(n / 2);
    }
}
