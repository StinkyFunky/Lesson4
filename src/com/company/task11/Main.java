package com.company.task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;

        }
        System.out.print(sum + " " + sum / count);
    }
}
