package com.company;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TreeSetE {
    public static void main(String[] args)
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(101);
        treeSet.add(102);
        treeSet.add(106);
        System.out.println(treeSet);
        treeSet.addAll(List.of(103,104,105));
        System.out.println(treeSet);
    }
}
