package com.company.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] mas = new int[n];

        for(int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
