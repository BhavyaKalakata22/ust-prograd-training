package com.company;
import java.util.Collections;
import java.util.PriorityQueue;
public class priorityqueueE {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(12);
        pq.add(2);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
