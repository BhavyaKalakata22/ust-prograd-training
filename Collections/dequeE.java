package com.company;

import java.util.ArrayDeque;

public class dequeE {
    public static void main(String[] args)
    {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("spades");
        deque.add("hearts");
        deque.addFirst("diamonds");
        deque.addLast("clubs");
        System.out.println(deque);
        System.out.println(deque.remove("hearts"));
        System.out.println(deque);
        deque.removeAll(deque);
        System.out.println(deque);

    }
}
