package com.company;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class LinkedListUseCase {
    public static void main(String[] args) {
            LinkedHashMap<Integer, String> lh = new LinkedHashMap();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. of employees: ");
            int m = sc.nextInt();
            System.out.println("Enter the id & name of employee");
            for (int i = 1; i <= m; i++) {
                lh.put(sc.nextInt(), sc.nextLine());
            }
            System.out.println("ID & NAME");
            for (Map.Entry<Integer, String> n : lh.entrySet()) {
                System.out.println(n.getKey() + " --> " + n.getValue());
            }
            System.out.println("Enter emp id to be searched");
            int id = sc.nextInt();
            for (Map.Entry<Integer, String> n : lh.entrySet()) {
                if (id == n.getKey()) {
                    System.out.println(id + "  is present....");
                }
            }
         }
}









