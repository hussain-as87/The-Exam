package com.company;


public class Main {
    int[] que = new int[4];
    int tail = -1;
    int head = -1;

    public void insert(int y) {
        if (tail == 3)
            System.out.println("the queues is full");
        else
            tail++;
        que[tail] = y;

    }

    public void delete() {
        if (tail == head)
            System.out.println("the queues is empty");
        else
            head++;
        System.out.println("the queues : " + que[head]);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.insert(12);
        main.insert(44);
        main.insert(44);
        main.insert(61);

        main.delete();
        main.delete();
        main.delete();
        main.delete();
    }
}


