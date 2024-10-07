package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean option = true;
        String tryAgain = "";
        while (option) {
            Scanner typing = new Scanner(System.in);
            try {
                String[] quotes = {"quote1", "quote2", "quote3", "quote4", "quote5", "quote6", "quote7", "quote8", "quote9", "quote10"};
                System.out.print("Select a number between 1 and 10: ");
                int number = typing.nextInt();
                typing.next();
                number--;
                System.out.println(quotes[number]);
            } catch (Exception e) {
                System.out.println("That is not a number between 1 and 10. Try again.");
                e.printStackTrace();
            }
            System.out.println("Would you like to see another quote? Input yes or no: ");
            String answer = typing.toString();
            if(answer.equals("no") || answer.equals("No")) answer = false;
        }

    }
}