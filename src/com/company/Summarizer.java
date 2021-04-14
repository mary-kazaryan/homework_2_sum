package com.company;

import java.util.Scanner;

public class Summarizer {

    public static void main(String[] args) {

        // Напишите программу, где пользователь вводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа.
        // Для ввода числа воспользуйтесь классом Scanner.

        Scanner num = new Scanner (System.in);
        int number = num.nextInt();

        int sum = 0;

        for (int n = 1; n <= number; n++) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
