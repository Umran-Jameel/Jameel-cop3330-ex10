/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise10 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String price1 = in.nextLine();
        double p1 = Double.parseDouble(price1);
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = in.nextLine();
        int q1 = Integer.parseInt(quantity1);
        p1 *= q1;

        System.out.print("Enter the price of item 2: ");
        String price2 = in.nextLine();
        double p2 = Double.parseDouble(price2);
        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = in.nextLine();
        int q2 = Integer.parseInt(quantity2);
        p2 *= q2;

        System.out.print("Enter the price of item 3: ");
        String price3 = in.nextLine();
        double p3 = Double.parseDouble(price3);
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = in.nextLine();
        int q3 = Integer.parseInt(quantity3);
        p3 *= q3;

        double subtotal = p1 + p2 + p3;
        double tax = 0.055 * subtotal;
        double total = tax + subtotal;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, tax, total);



    }
}
