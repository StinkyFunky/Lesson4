package com.company.task27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int min = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[min]) {
                min = i;
            } else if(arr[i] > arr[max]) {
                max = i;
            }
        }

        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
