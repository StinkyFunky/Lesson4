package com.company.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] nums = {6, 19, 26, 9, 46, 8, 5, 65, 90, 25};
        System.out.println("ВВедите индекс: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println(nums[scanner.nextInt()]);
    }
}
