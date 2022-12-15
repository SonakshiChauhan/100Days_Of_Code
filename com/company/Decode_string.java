package com.company;

import java.util.Stack;

public class Decode_string {

        public String decodeString(String s) {
            String str = "";
            StringBuilder temp;
            Stack<String> stack_str = new Stack<>();
            Stack<Integer> stack_num = new Stack<>();
            int num = 0;
            char c = ' ';
            for(int i=0; i<s.length(); i++){
                c = s.charAt(i);
                if(c =='['){
                    stack_str.push(str);
                    str = "";
                }
                else if(c ==']'){
                    temp = new StringBuilder(stack_str.pop());
                    num = stack_num.pop();
                    for(int t=0; t<num; t++)
                        temp.append(str);
                    str =  temp.toString();
                }
                else if(c<='9' && c>='0'){
                    num = 0;
                    while(c<='9' && c>='0'){
                        num = num*10+(c-'0');
                        i++;
                        c = s.charAt(i);
                    }
                    stack_num.push(num);
                    i--;
                }
                else { //if((c>='a'&&c<='z') || (c>='A'&&c<='Z'){
                    str += c;
                }
            }
            return str;
        }
    }

