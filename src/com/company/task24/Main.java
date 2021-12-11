package com.company.task24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (m == arr[i]) {
                index = i;
                System.out.println("Yes " + index);
            } else {
                System.out.println("No");
            }
        }

    }
}
