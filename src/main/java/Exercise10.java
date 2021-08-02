/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise10 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> values = new ArrayList<>();
        int counter = 1;

        // program changed for challenge, user can enter infinite amount of items, thoretically
        while (true) {
            System.out.printf("Enter the price of item %d (enter done if done): ", counter);
            String input = in.nextLine();
            double p = 0;
            if (input.equals("done")) {
                break;
            }
            else {
                // ensuring the user enters numerical data (challenge)
                try {
                    p = (Double.parseDouble(input));
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a numeric value or enter done");
                    System.exit(0);
                }
            }

            System.out.printf("Enter the quantity of item %d (enter done if done): ", counter);
            String inputQ = in.nextLine();
            double q = 0;
            try {
                q = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a numeric value or enter done");
                System.exit(0);
            }
            values.add(p * q);
            counter++;
        }
        double subtotal = 0;
        for (int i = 0; i < values.size(); i++) {
            subtotal += values.get(i);
        }
        double tax = 0.055 * subtotal;
        double total = tax + subtotal;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, tax, total);



    }
}
