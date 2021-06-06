package ex08;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 8 - Pizza Party
Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.

Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = in.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizza = in.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = in.nextInt();

        System.out.println(people + " people with " + pizza + " pizzas (" + (pizza * slices) + " slices)");
        System.out.println("Each person gets " + ((pizza * slices) / people) + " pieces of pizza.");
        System.out.println("There are " + ((pizza * slices) % people) + " leftover pieces.");
    }
}
