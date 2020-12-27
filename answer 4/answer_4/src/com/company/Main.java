package com.company;

public class Main {
    static final int[] stack = new int[8];
    static int top = -1;

    public void push(int y) {
        if (top == 7)
            System.out.println("the stack is completed");
        else
            top++;
        stack[top] = y;
    }

    public static int pop(int n) {
        if (top == -1)
            System.out.println("the stack is empty");
        else
            if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (stack[top] != i + 1) {
                temp[j++] = stack[top];
            }
        top--;
        return j;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(1);
        main.push(2);
        main.push(3);
        main.push(4);
        main.push(5);
        main.push(6);
        main.push(7);
        main.push(7);
        int l = stack.length;
        l = pop(l);
        for (int i = 0; i <= l; i++)
            System.out.print(stack[i] + " ");
    }
}