package com.company;
/*
Runtime:3 ms
Space: 55 MB
 */
public class reverse_string_using_recursion {
    public void reverseString(char[] s){
    solve(s,0,s.length-1);}
    public void solve(char[] s,int start,int end){
        if(start>=end)return;
        swap(s,start,end);
        solve(s,++start,--end);
    }
    public void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
