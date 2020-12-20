package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int[][] names = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                names[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + names[i][j];
            }
        }
        System.out.println("the summation name = " + sum);
    }
}
