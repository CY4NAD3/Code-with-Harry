package com.company;

public class cwh_35_practice_set_on_methods {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0; i<n; i++){
            for (int j = n-1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line


    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static float printAvg(float ...arr){
        float sum = 0.0f;
        for (int i=0; i<arr.length; i++ ){
            sum += arr[i];
        }
        float totalNum = arr.length;
        float avg = sum/totalNum;
        return avg;
    }


    public static void main(String[] args) {
        // Problem 1
        // multiplication(7);

        // Problem 2
        // pattern1(9);
        //pattern1_rec(3);

        // Problem 3
        // int c = sumRec(4);
        // System.out.println(c);

        //Problem 4
        //pattern2(4);

        // Problem 5
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // int result = fib(7);
        // System.out.println(result);

        //Problem 6
        System.out.println(printAvg(30.55f,40.2f,50.0f));

        // Problem 8
        //pattern1(9);

    }
}
