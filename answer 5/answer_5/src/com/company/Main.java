package com.company;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    static Queue<Integer> queue;


    static void Print() {
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }

    static void reverse_queue() {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }


    public static void main(String[] args) {
        queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);


        reverse_queue();
        Print();
    }
}


