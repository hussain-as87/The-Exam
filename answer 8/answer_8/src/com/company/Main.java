package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> salary = new ArrayList<>();
        HashMap<String, Integer> employee = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int n = 1; n <= 5; n++) {
            System.out.println("enter name of employee : " + n);
            name.add(scanner.next());
            System.out.println("enter salary of employee : " + n);
            salary.add(scanner.nextInt());
            employee.put(name.get(0), salary.get(0));
            name.clear();
            salary.clear();
        }
        for (String i : employee.keySet()) {
            System.out.println("Employee : " + i + "  ,  Salary = " + employee.get(i));
        }
        System.out.println("\n the size is : " + employee.size());
        System.out.println("\n check of value : " + employee.containsKey("mohammed"));
        System.out.println("\n print salary of employee (hamza) : " + employee.get("hamza"));

    }
}
