package com.company;
import java.util.Scanner;

public class CWH_Ex1_board_pers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total marks of 1 subject:");
        double total = sc.nextDouble();
        total = total * 5;

        System.out.println("Enter the marks of subject 1:");
        double s1 = sc.nextDouble();
        System.out.println("Enter the marks of subject 2:");
        double s2 = sc.nextDouble();
        System.out.println("Enter the marks of subject 3:");
        double s3 = sc.nextDouble();
        System.out.println("Enter the marks of subject 4:");
        double s4 = sc.nextDouble();
        System.out.println("Enter the marks of subject 5:");
        double s5 = sc.nextDouble();

        double sum = s1+s2+s3+s4+s5;
        double perc = (sum/total)*100;

        System.out.println("The percentage of the mark= ");
        System.out.println(perc + "%");
    }
}
