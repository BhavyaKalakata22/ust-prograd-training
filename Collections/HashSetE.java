package com.company;

import java.util.HashSet;
import java.util.List;
public class HashSetE {
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ECE");
        hashSet.add("EEE");
        hashSet.add("CSE");
        System.out.println(hashSet);
        hashSet.addAll(List.of("MCA","MBA"));
        System.out.println(hashSet);
    }
}
