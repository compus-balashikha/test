package com.company.demo;


public class FindMaximumNumber {

    public static void main(String[] args) {

        int a = 150;
        int b = 24;
        int c = -72;


        if (a > b) {
            if (a > c) {
                System.out.println("The maximum number is " + a);
            } else {
                System.out.println("The maximum number is " + c);
            }
        } else if (a == b) {
            if (a > c) {
                System.out.println("The maximum number is " + a + " and we have two of them");
            } else if (a == c) {
                System.out.println("All numbers are equal");
            } else {
                System.out.println("The maximum number is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("The maximum number is " + b);
            } else {
                System.out.println("The maximum number is " + c);
            }
        }

    }

}
