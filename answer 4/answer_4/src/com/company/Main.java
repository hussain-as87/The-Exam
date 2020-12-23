package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    private final int[] st = new int[4];
    private int top = -1;
    IntStream c;

    public void push(int y) {
        if (top == 3)
            System.out.println("the stack is completed");
        else
            top++;
        st[top] = y;
    }

    public void pop() {
        if (top == -1)
            System.out.println("the stack is empty");
        else
            System.out.println("(" + Arrays.stream(st).distinct() + ") ");
        top--;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(1);
        main.push(2);
        main.push(3);
        main.push(3);


        main.pop();
        /*
        main.pop();
        main.pop();
        main.pop();*/
    }
}