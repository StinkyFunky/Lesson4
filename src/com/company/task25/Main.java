package com.company.task25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (m < arr[i]) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
