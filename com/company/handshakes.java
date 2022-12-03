package com.company;

public class handshakes {

        static int count(int N)
        {
            if(N==0) return 1;
            int ans=0;
            for(int i=0; i < N; i+=2)
                ans+= count(i)*count(N-2-i);

            return ans;
        }

    };

