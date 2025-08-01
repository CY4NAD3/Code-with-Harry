package com.company;

import java.util.Scanner;

public class cwh_82_nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int ind;
        while(flag) {
            System.out.println("Enter the value of index");
            try {
                ind = sc.nextInt();
            }
            catch (Exception e) {
                System.out.println("Please enter a valid index");
                sc.next(); // Clear the invalid input
                continue; // Skip to the next iteration of the loop
            }

            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
