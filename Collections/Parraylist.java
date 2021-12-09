package com.company;
import java.util.ArrayList;

public class PArrlist {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(878715478);
        arrayList.add(84551896);
        arrayList.add(987614511);
        System.out.println(arrayList);
        arrayList.addAll(2,arrayList);
        System.out.println(arrayList);

    }
}
