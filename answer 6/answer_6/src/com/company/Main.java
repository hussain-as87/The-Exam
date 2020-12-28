package com.company;


import java.util.LinkedList;
import java.util.Queue;

public class Main {


    static void printQueue(Queue<Integer> queue) {
        while (!queue.isEmpty())
            System.out.println(queue.remove() + " ");
    }

    static void deleteEven(Queue<Integer> queue) {
        Queue<Integer> queue1 = new LinkedList<>();
        while (!queue.isEmpty()) {
            int value = queue.remove();
            if (value % 2 == 1)
                queue1.add(value);
        }
        while (!queue1.isEmpty())
            queue.add(queue1.remove());
        printQueue(queue);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(16);
        queue.add(17);
        queue.add(18);
        queue.add(19);
        queue.add(20);
        queue.add(21);

        deleteEven(queue);

    }
}
