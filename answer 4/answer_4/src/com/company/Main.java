package com.company;

public class Main {

    private int[] number  = new int[4];
    private int top = -1;

    public void push(int y) {
        if (top == 3)
            System.out.println("full");
        else
            top++;
        number[top] = y;
    }

    public void pop() {
        if (top == -1)
            System.out.println("empty");
        else
            top--;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(10);
        main.push(20);
        main.push(30);
        main.push(40);
        main.push(50);

        main.pop();
        main.pop();
        main.pop();
        main.pop();
        //    st.pop();
    }
}
