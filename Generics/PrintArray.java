package com.company;
class Printer<bhavya>{
    public <bhavya> void printArray(bhavya[] size) {
        for(bhavya element : size){
            System.out.print(element);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Integer[] intArray = {1,2,3,4};
        String[] stringArray = {"Hey","What's_up","?"};
       // printer.printArray(intArray);
       // printer.printArray(stringArray);
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
        System.out.println("\n");
        for(int i=stringArray.length-1;i>=0;i--)
            System.out.print(stringArray[i] + "  ");
    }
}