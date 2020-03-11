package reversePolishNotationCalculator;

import java.util.Stack;

public class Calc {

    public double evaluate(String s) {
        if ("".equals(s)) {
            return 0;
        }

        Stack<Double> stack = new Stack<>();
        String[] exp = s.split(" ");

        for (String singleExp: exp) {
            Double x, y;
            switch (singleExp) {
                case "+": stack.push(stack.pop() + stack.pop()); break;
                case "-": y = stack.pop(); x = stack.pop(); stack.push(x - y); break;
                case "*": stack.push(stack.pop() * stack.pop()); break;
                case "/": y = stack.pop(); x = stack.pop(); stack.push(x / y); break;
                default:
                    stack.push(Double.parseDouble(singleExp));
            }
        }

        return stack.pop();
    }
}