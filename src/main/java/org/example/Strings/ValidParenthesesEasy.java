package org.example.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesesEasy {

    public static void main(String[] args) {

        System.out.println(isValid("()()()"));

    }

//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']' , determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.


    public static boolean isValid(String s) {

        //ilosc charow musi byc parzysta
        if(s.length()%2!=0)
            return false;

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

    }
}
