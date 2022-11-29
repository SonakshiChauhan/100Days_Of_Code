package com.company;

public class reduce_to_zero {

        public int numberOfSteps(int num) {

            return helper(num,0);
        }

        static int helper(int n,int ans){
            if(n==0){return ans;}

            if(n%2==0){return helper(n/2,ans+1);}
            return helper(n-1,ans+1);
        }

}
