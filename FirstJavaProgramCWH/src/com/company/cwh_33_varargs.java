package com.company;

public class cwh_33_varargs {

    public static int add(int ...arr){

        int result = 0;

//        for (int a : arr){
//            result = result + a;
//        }
//        return result;

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

            System.out.println(add(1,2));
            System.out.println(add(2,3,4));
            System.out.println(add(4,5,6));
    }
}
