package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No_ofwaysto_add_parenthesis {

        public List<Integer> diffWaysToCompute(String exp) {
            Set<Integer> operators=new HashSet<Integer>();
            operators.add((int)'+');
            operators.add((int)'-');
            operators.add((int)'*');

            List<Integer> results=new ArrayList<Integer>();
            for(int i=0;i<exp.length();i++){
                if(operators.contains((int)exp.charAt(i))){
                    List<Integer> leftOperands=diffWaysToCompute(exp.substring(0,i));
                    List<Integer> rightOperands=diffWaysToCompute(exp.substring(i+1,exp.length()));
                    results.addAll(computeOperandCombinations(leftOperands, rightOperands, exp.charAt(i)));
                }
            }
            if(results.isEmpty()){
                results.add(Integer.parseInt(exp));
            }
            return results;
        }


        public List<Integer> computeOperandCombinations(
                List<Integer> leftOperands,
                List<Integer> rightOperands,
                char operation) {
            List<Integer> results = new ArrayList<Integer>();
            for (Integer leftOperand : leftOperands) {
                for (Integer rightOperand : rightOperands) {
                    if (operation == '+') {
                        results.add(leftOperand + rightOperand);
                    } else if (operation == '-') {
                        results.add(leftOperand - rightOperand);
                    } else if (operation == '*') {
                        results.add(leftOperand * rightOperand);
                    }
                }
            }

            return results;
        }


}
