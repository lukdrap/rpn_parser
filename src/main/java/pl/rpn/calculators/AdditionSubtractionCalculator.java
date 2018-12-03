package pl.rpn.calculators;

import java.util.Stack;
import java.util.function.BiFunction;

public class AdditionSubtractionCalculator implements Calculator {

    public Double calculate(String[] value) {
        Stack<Double> stack = new Stack<>();

        for(String sign : value){
            switch(sign){
                case "+":
                    calc(stack, (num1,num2)->num1+num2);
                    break;
                case "-":
                    calc(stack, (num1,num2)->num2-num1);
                    break;
                default:
                    stack.push(Double.parseDouble(sign));
            }
        }
        return stack.pop();
    }

    private void calc(Stack<Double> stack, BiFunction<Double, Double, Double> operation){
        stack.push(operation.apply(stack.pop(), stack.pop()));
    }
}
