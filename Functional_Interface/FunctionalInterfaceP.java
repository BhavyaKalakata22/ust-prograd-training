package com.company;
@FunctionalInterface
interface Add
{
    public int add(int a,int b);
    //public int sub(int c,int d);
}
interface Sub
{
   public int sub(int c,int d);
}
interface Mul
{
    public int mul(int e,int f);
}


public class FunctionalInterfaceP {
    public static void main(String[] args)
    {
        Add addable = (int a,int b) -> {return(a+b);};
        Sub subtract = (int c,int d) -> {return(c-d);};
        Mul multiplication = (int e,int f) -> {return(e*f);};

        System.out.println(addable.add(8,5));
        System.out.println(subtract.sub(10,2));
        System.out.println(multiplication.mul(12,5));
    }
}
