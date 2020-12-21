package com.company;

import java.util.Scanner;

public class Main {

    int[] que = new int[4];
    int rear = -1;
    int front = -1;
    int sum = 0;
    int min = 0;
    int mul = 0;
    int n = 0;
    float avg;

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
            System.out.println(que[front]);
        sum = sum + que[rear];
        min = min - que[rear];
        mul = mul * que[rear];
        n++;
        front++;
      //  System.out.println("single values : " + que[front]);
        if (rear <  0)
            System.out.println("sum = " + sum);
            System.out.println("min = " + min);
            System.out.println("mul = " + mul);
            avg=sum/n;
          System.out.println("avg = "+avg);

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            main.insert(Integer.parseInt(sc.next()));
        }
        for (int j = 0; j < 4; j++) {
            main.delete();
        }
    }


}
