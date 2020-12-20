package com.company;

public class Main {
    private int[] stack = new int[2];
    private int top = -1;

    public void push(int y) {
        if (top == 1)
            System.out.println("the stack is completed");
        else
            top++;
        stack[top] = y;
    }

    public void pop() {
        if (top == -1)
            System.out.println("the stack is empty");
        else if (top > 0)
            System.out.println("(" + stack[top] + ")  positive Number");

        else
            System.out.println("(" + stack[top] + ")  minus Number");
        top--;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.push(-11);
        main.push(4);

        main.pop();
        main.pop();

    }
}