package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalculationUtils {

    public static List<String> infixToPostfixConvert(String input) {

        int priority = 0;
        StringBuilder postfixBuffer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        List<String> postfixArray = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                if (postfixBuffer.length() > 0) {
                    postfixArray.add(postfixBuffer.toString());
                }
                postfixBuffer = new StringBuilder();
                if (stack.size() == 0)
                    stack.push(ch);
                else {
                    Character chTop = (Character) stack.peek();
                    if (chTop == '*' || chTop == '/')
                        priority = 1;
                    else
                        priority = 0;
                    if (priority == 1) {
                        postfixArray.add(String.valueOf(stack.pop()));
                        i--;
                    } else {
                        if (ch == '+' || ch == '-') {
                            postfixArray.add(String.valueOf(stack.pop()));
                            stack.push(ch);
                        } else
                            stack.push(ch);
                    }
                }
            } else {
                postfixBuffer.append(ch);
            }
        }
        postfixArray.add(postfixBuffer.toString());
        int len = stack.size();
        for (int j = 0; j < len; j++)
            postfixArray.add(stack.pop().toString());

        return postfixArray;
    }
}
