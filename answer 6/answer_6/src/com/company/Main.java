package com.company;


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
        else  if (que[rear] % 2 == 1)
                front++;
                System.out.println("the queues : " + que[front]);


    }

    public static void main(String[] args) {
        Main main = new Main();
        main.insert(12);
        main.insert(44);
        main.insert(15);
        main.insert(61);

        main.delete();
        main.delete();
        main.delete();
        main.delete();


    }
}
