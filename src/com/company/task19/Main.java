package com.company.task19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int min = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            min = arr[0];
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min * min);
    }
}
