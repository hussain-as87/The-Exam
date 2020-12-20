package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[] que = new int[4];
    int rear = -1;
    int front = -1;

    public void insert(int y) {
        if (rear == 3)
            System.out.println("the queues is full");
        else

            rear++;
        que[rear] = y;

    }

    public void delete() {
        if (rear == front)
            System.out.println("the queues is empty");
        else
            front++;
        //  System.out.println("the queues : " + que[front]);

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 4; j++) {
            main.que[j] = Integer.parseInt(sc.next());
        }

        System.out.println("the max number = " + Arrays.stream(main.que).max());
        System.out.println("the min number = " + Arrays.stream(main.que).min());


       /* main.delete();
        main.delete();
        main.delete();
        main.delete();*/

    }
}







