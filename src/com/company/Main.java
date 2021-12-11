package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ARRAY
        //инициализация типов
        //byte, short, long, int - 0
        //char - /u0000 - ''
        //boolean - false
        //float, double - 0.0
        //Все экзепляры класса инициализируются по умолчанию null

//        int[] mass = {1, 2, 3};// инициализация сразу
//        int[] mass1 = new int[10]; //длина 10
//        int[] mass3; //нет инициализвции массива будет ошибка.
//
//        String[] massStr = new String[10];
//
//        massStr[0] = "Alex";
//        massStr[1] = "Bob";
//        massStr[2] = "Tom";
//        massStr[3] = "Lex";
//
//        for(int i = 0; i < massStr.length; i++) {
//            System.out.println(massStr[i]);
//        }

//        int[] nums = {6, 19, 26, 9, 46, 8, 5, 65, 90, 25};
//        Arrays.sort(nums);
//
//        for(int temp : nums) {
//            System.out.println(temp);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//
//        System.out.println(maxValue(num1, num2, num3));

        //20
        Scanner scanner = new Scanner(System.in);

        System.out.println(getSeason(scanner.nextInt()));
    }

    //20
    private static String getSeason(int seasonNumber) {
        switch (seasonNumber) {
            case 12:
            case 1:
            case 2: return "Winter";
            case 3:
            case 4:
            case 5: return "Spring";
            case 6:
            case 7:
            case 8: return "Summer";
            case 9:
            case 10:
            case 11: return "Autumn";
            default:
                return "Incorrect month number";

        }
    }

//    private static int maxValue(final int num1,final int num2,final int num3) {
//        if(num1 > num2 && num1 > num3){
//            return num1;
//        } else if (num2 > num1 && num2 > num3){
//            return num2;
//        } else {
//            return num3;
//        }
//    }
}
