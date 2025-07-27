package com.company;
import java.util.Scanner;

public class cwh_29_Practice_Set_6 {
    public static void main(String[] args){

        //Problem 1
        /* float sum = 0.0f;
        System.out.println("Enter the 5 numbers: ");
        Scanner sc = new Scanner(System.in);
            float []arr = new float[5];

            for (int i=0; i<5; i++){
                arr[i] = sc.nextFloat();
            }
            for (int i=0; i<5; i++){
                sum += arr[i];
            }
        System.out.println("The sum is: " + sum);
        sc.close();
        */
        /*
        // Practice Problem 1
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
        */

        //Practice Problem 2
//        float []marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float num = 62.4f;
//        boolean isInArray = false;

//        for(float element:marks){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
        /*for(int i=0; i<marks.length; i++){
            if(num == marks[i]){
                isInArray=true;
                break;
            }
        }
         */
//        if(isInArray==true) {
//            System.out.println("The number is in array");
//        }
//        else {
//            System.out.println("The number is not in array");
//        }

        //Practice Problem 3
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        float avg = sum/marks.length;
//        System.out.println(avg);

        //Practice Problem 4
//        int [][]mat1={{1,2,3},
//                      {4,5,6},
//                     };
//        int [][]mat2={{2,6,13},
//                      {3,7,1},
//                     };
//        int [][]result = new int[2][3];
//        //Printing elements of a 2d array
//        System.out.println("Result of matrix addition:");
//        for (int i=0;i< result.length;i++){
//            for (int j=0; j< result[i].length;j++){
//                result[i][j]=mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

        //Practice problem 5

//        int []arr={1,21,3,4,5,34,67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp = 0;
//        for(int i=0; i<n; i++){
//            //swap a[i] and a[l-1-i]
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for(int element:arr){
//            System.out.print(element + " ");
//        }

        //Practice Problem 6
//        int []arr={1,-2000,3,4,82,34,67};
//        int min = 0;
//        int max = 0;

//        for(int e:arr) {
//            if (e > max)
//                max = e;
//        }
//        for (int i=0; i<arr.length; i++){
//            if (arr[i]<min){
//                min=arr[i];
//            }
//        }
//
//        for (int i=0; i<arr.length; i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Minumum: " + min);
//        System.out.println("Maximum: " + max);

//        System.out.println(Integer.MIN_VALUE); //integer er in general max min val
//        System.out.println(Integer.MAX_VALUE);

        //Practice problem 8
        int []arr1={1,-2000,3,4,82,34,67};
        boolean isSorted1 = false;
        for (int i=0;i<arr1.length-1; i++){
            if (arr1[i]>arr1[i+1]){
                isSorted1 = false;
                break;
            }
            else {
                isSorted1 = true;

            }
        }
        if (isSorted1==false){
            System.out.println("The array1 is not sorted");
        }
        else {
            System.out.println("The array1 is sorted");
        }

        int []arr2={10,20,34,444,823,1000,6700};
        boolean isSorted2 = false;
        for (int i=0;i<arr2.length-1; i++){
            if (arr2[i]>arr2[i+1]){
                isSorted2 = false;
                break;
            }
            else {
                isSorted2 = true;

            }
        }
        if (isSorted2 == false){
            System.out.println("The array2 is not sorted");
        }
        else {
            System.out.println("The array2 is sorted");
        }


        }
    }

