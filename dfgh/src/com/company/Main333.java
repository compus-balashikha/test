package com.company;

import java.util.Scanner;

public class Main333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println(a);

        if (a > b) {
            System.out.println("A больше чем b");
        } else if (a == b) {
            System.out.println("equals");
        } else {
            System.out.println();
        }
    }


//    Странное число. Ввести число, вывести является ли число
// странным или нет.
// Число является странным если: оно нечётное либо четное и лежит
// в промежутке от 6 включительно до 38 не включительно.

}
