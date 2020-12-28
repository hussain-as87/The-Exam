package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int[][] number = new int[2][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                number[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum = sum + number[i][j];
            }
        }
        System.out.println("the summation  =  (" + sum+")");
    }
}
