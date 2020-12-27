package com.company;


import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // Utility function to print
    // the contents of a stack
    static void printQueue(Queue<Integer> queue)
    {
        while (!queue.isEmpty())
            System.out.println(queue.remove() + " ");
    }

    // Function to delete all even
    // elements from the stack
    static void deleteEven(Queue<Integer> queue)
    {
        Queue<Integer> queue1 = new LinkedList<>();

        // While stack is not empty
        while (!queue.isEmpty()) {
            int value = queue.remove();

            // If value is odd then push
            // it to the temporary stack
            if (value % 2 == 1)
                queue1.add(value);
        }

        // Transfer the contents of the temporary stack
        // to the original stack in order to get
        // the original order of the elements
        while (!queue1.isEmpty())
            queue.add(queue1.remove());

        // Print the modified stack content
        printQueue(queue);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(16);
        queue.add(15);
        queue.add(29);
        queue.add(29);
        queue.add(19);
        queue.add(20);
        queue.add(21);

        deleteEven(queue);

    }
}
