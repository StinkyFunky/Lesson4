package com.company.task9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int j : arr) {
            if(j > 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
