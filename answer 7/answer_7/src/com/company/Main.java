package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int sum = 0;
    static int min = 0;
    static int multi = 0;
    static int a, b,c;
    static double avg;

    static void printQueue() {

       /* while (!queue.isEmpty())
            System.out.print(queue.remove());*/

        System.out.println("(summation)        "+a+"+"+b+"+"+c+" = "+sum);
        System.out.println("(minus)            "+a+"-"+b+"-"+c+" = "+min);
        System.out.println("(multiplication)   "+a+"*"+b+"*"+c+" = "+multi);
          System.out.println("(average) = " + avg);
    }


    static void process(Queue<Integer> queue) {
        Queue<Integer> queue1 = new LinkedList<>();


        while (!queue.isEmpty()) {
            int value = queue.remove();
            sum= a+b+c;
            min=  a-b-c;
            multi= a*b*c;
            avg=sum/3;
            queue1.add(value);
        }

        while (!queue1.isEmpty())
          queue.add(queue1.remove());

        printQueue();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        queue.add(a);
        queue.add(b);
        queue.add(c);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        process(queue);

    }
}
