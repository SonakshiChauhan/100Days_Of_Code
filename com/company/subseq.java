package com.company;

import java.util.ArrayList;

public class subseq {

    static void subseq(String p,String up){
        if(up.isEmpty()){
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = subseqRet(p+ch,up.substring(1));
        ArrayList<String> right = subseqRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
