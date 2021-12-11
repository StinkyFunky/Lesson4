package com.company.task28;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        int evenNums = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] % 2 == 0) {
                evenNums++;
            }
        }

        int[] mas = new int[evenNums];
        int index = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                mas[index] = arr[i];
                index++;
            }
        }
        System.out.print(Arrays.toString(mas));
    }
}
