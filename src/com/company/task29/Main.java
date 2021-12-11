package com.company.task29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        int start = -1;
        int end = -1;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if(arr[i] == 0) {
                start = i;
            }
            if(arr[j] == 0) {
                end = j;
            }
            if(start != -1 && end != -1) {
                break;
            }
        }

        for(int i = start; i < end; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
