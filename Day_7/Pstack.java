package com.company;

import java.util.Stack;
public class Pstack {
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();
        stack.push("plate1");
        stack.push("plate2");
        stack.push("plate3");
        stack.push("plate4");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.indexOf("plate2"));
    }
}
