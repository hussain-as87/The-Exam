package com.company;

import java.util.Scanner;

public class Main {

    int[] que = new int[4];
    int rear = -1;
    int front = -1;


    public int insert(int y) {
        if (rear == 3)
            System.out.println("the queues is full");
        else
            rear++;
        que[rear] = y;

        return y;
    }

    public void delete() {

        if (rear == front)
            System.out.println("the queues is empty");
        else
            front++;
        //System.out.println("single values : " + que[front]);
    }

    public static void main(String[] args) {
        int sum=0;
        int min = 0;
        int mul = 0;
        int n = 0;
        double avg = 0;

        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            n = main.insert(Integer.parseInt(sc.next()));
            sum += n;
            mul *= n;
            min -= n;
            n++;
            avg=sum/4;
        }

        for (int j = 0; j < 4; j++) {
            main.delete();
        }
        System.out.println("sum = " + sum);
        System.out.println("mul = " + mul);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }


}
