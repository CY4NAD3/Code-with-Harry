package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args){
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int a = sc.nextInt();
//
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2: ");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        float sum = a + b;
//        System.out.println("The sum of the numbers are: ");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);

        sc.close();
    }
}
