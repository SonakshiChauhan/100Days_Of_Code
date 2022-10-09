package com.company;

public class Fibo_using_recursion {
    class Solution {
        public int fib(int n) {
            if(n<2){return n;}
            return (fib(n-1)+fib(n-2));
        }
    }
}
