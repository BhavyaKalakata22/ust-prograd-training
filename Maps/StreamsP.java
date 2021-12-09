package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ArrayListStream {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("Bhavya", "Sravani", "Lakshmi", "Nitya", "Bhargav"));
        ArrayList<String> filtered = (ArrayList<String>)
                arrayList.stream()
                        .filter(str -> str.startsWith("B"))
                        .collect(Collectors.toList());
                System.out.println(filtered);
        ArrayList<Character> charater = new ArrayList<>(Arrays.asList('E','R','R','O','R'));
        ArrayList<Character> filterchar = (ArrayList<Character>)
                charater.stream()
                        .filter(str -> str.equals('R'))
                        .collect((Collectors.toList()));
                        System.out.println(filterchar);
    }
}