package com.company;
import java.util.Collections;
import java.util.PriorityQueue;
    public class priorityqueueE1 {
        public static void main(String[] args)
        {
            PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
            pq.add(9);
            pq.add(5);
            pq.add(14);
            pq.add(16);
            System.out.println(pq);
            pq.poll();
            System.out.println(pq);
        }
    }

