package com.company;

public class Main {
    public static void main(String[] args) {
      //  Animal animal;
        Animal animal1 = new Dog();
        animal1.eat();
        animal1.run();
    }
}

abstract class Animal {
    public void run() {
        System.out.println("Animal is running");
    }

    abstract public void eat();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

