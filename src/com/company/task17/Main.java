package com.company.task17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 1;
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && i % 2 == 0){
                sum *= arr[i];
            }
        }
        System.out.println(sum);
    }
}
