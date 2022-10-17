package com.company;
/*
Runtime:1ms
Space:40.8 MB
 */
public class Number_of_steps_to_make_a_number_zero {
    public int numberOfSteps(int num) {

        return helper(num,0);
    }

    static int helper(int n,int ans){
        if(n==0){return ans;}

        if(n%2==0){return helper(n/2,ans+1);}
        return helper(n-1,ans+1);
    }
}
