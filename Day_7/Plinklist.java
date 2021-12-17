package com.company;

import java.util.LinkedList;
public class Plinklist {
    public static void main(String[] args)
    {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Hello");
        linkedlist.add("how are you");
        linkedlist.add("is everthing good");
        System.out.println(linkedlist);
        linkedlist.remove(2);
        System.out.println(linkedlist);
        System.out.println(linkedlist.lastIndexOf("how are you"));
    }
}
