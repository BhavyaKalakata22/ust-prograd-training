package com.company
public class VectorCollection {
    public static void main(String[] args) {
        Vector<String> lang = new Vector<>(4, 2);
        lang.add("Java");
        lang.add("Python");
        lang.addElement("GoLang");
        System.out.println(lang);
        lang.add(0,"Fortran");
        System.out.println(lang);
        System.out.println("is empty? " + lang.isEmpty());
        System.out.println("clone --> " + lang.clone());
        System.out.println(lang.indexOf("GoLang"));
        System.out.println("size before adding " + lang.size());
        System.out.println("capacity before adding " + lang.capacity());
        lang.add("R");
        lang.add("Error");
        lang.removeElement("Error");
        lang.addElement("Php");
        lang.add("Swift");
        lang.add("C#");//now size 8(capacity 8)
        lang.add("C++");//size 9 (capacity 10)
        lang.add("JS");
        lang.add(2, "SQL");//size 11-->capacity 12 (capacity incremented by 2)
        System.out.println("size " + lang.size());
        System.out.println("capacity " + lang.capacity());
    }
}