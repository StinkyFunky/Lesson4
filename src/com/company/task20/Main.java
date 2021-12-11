package com.company.task20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int maxInd = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
                maxInd = i;
            }
        }
        System.out.println(maxInd + "-" + max);
    }
}
