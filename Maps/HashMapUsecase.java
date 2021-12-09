package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapUsecase {
    public static void main(String[] args){
        Map<Integer,String> map =new HashMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of family members ");
        int m=sc.nextInt();
        System.out.println("Enter the age & name of each member in your family");
        for (int i = 1; i <= m; i++) {
            map.put(sc.nextInt(), sc.nextLine());
        }
        System.out.println("Age & Name");
        for(Map.Entry<Integer,String>n:map.entrySet()){
            System.out.println(n.getKey() + " -->" + n.getValue());
        }
        for(Map.Entry<Integer,String>n:map.entrySet()){
            if(n.getKey()>=60){
                System.out.println(n.getValue()+"will get a pention money");
            }
        }

    }

}

