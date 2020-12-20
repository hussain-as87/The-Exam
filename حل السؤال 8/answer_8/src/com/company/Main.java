package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> employee = new HashMap<String, Integer>();

        employee.put("محمد", 2500);
        employee.put("حمزة", 1000);
        employee.put("ياسر", 920);
        employee.put("هادي", 2000);

        for (String i:employee.keySet()){/*values()*/
            System.out.println("Employee : "+i+"    Salary = "+employee.get(i));
        }
        System.out.println("\n the size is : "+employee.size());
        System.out.println("\n check of value : "+employee.containsKey("محمد"));
        System.out.println("\n print salary of employee : "+employee.get("حمزة"));

    }
}
