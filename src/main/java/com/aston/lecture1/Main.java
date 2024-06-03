package com.aston.lecture1;

import java.util.Arrays;

class HomeWork {
    /*
    в первой части все задачи будут иметь только логику и объявление метода.
    Вызов метода для печати в консоль результатов всех задач будет в методе main во второй части
    */

    //Задание 1
    public static String printThreeWords(/*String words*/) {
        return "\nТри слова в столбец: " + "\nOrange\nBanana\nApple\n";
    }

    //Задание 2

    public static boolean checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        return a + b >= 0;
    }

    //Задание 3

    private static int printColor(int a) {
        if (a <= 0) System.out.println("Красный\n");
        else if (a > 0 && a <= 100) System.out.println("Желтый\n");
        else if (a > 100) System.out.println("Зеленый\n");
        return a;
    }

    //Задание 4
    public static boolean compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
        return a >= b;
    }

    //Задание 5
    public static boolean sumInRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20) return true;
        else return false;
    }

    //Задание 6
    public static void posNegative(int a) {
        if (a>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //Задание 7
    public static void trueNegative(int a) {
        if (a<0) System.out.println(true);
        else {
            System.out.println(false);
        }
    }

    //Задание 8 - не решенное
    public static void counterPrint(String text, int times) {
        for (int a = 0; a < times; a++) {
            System.out.println(text + (times - a));
        }
    }

    //Задание 9
    public static void isLeapYear(int y) {
        boolean year4 = (y % 4 == 0);
        boolean yearHundred = (y % 100 != 0);
        boolean year4Hundred = (y % 400 == 0);
        if (year4 || yearHundred && year4Hundred) {
            System.out.println("True");
        } else System.out.println(false);
    }

    //Задание 10
    private static void arraySwap(int[] arr) {
        for (int h = 0; h < arr.length; h++) {
            arr[h] = (arr[h] == 1) ? 0 : 1;

        }
    }

    //Задание 11
    private static void array100(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            arr[k] = k + 1;
        }
    }

    //Задание 12
    private static void arrMult(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] < 6) {
                arr[l] = arr[l] * 2;
            }
        }
    }

    //Задание 13
    private static void arrCrossFill(int[][] arr) {
        for (int s = 0; s < arr.length; s++) {
            for (int h = 0, q = arr.length - 1; h < arr.length; h++, q--) {
                if (s == h || s == q) {
                    arr[s][h] = 1;
                } else {
                    arr[s][h] = 0;
                }
            }
        }
    }

    private static void arrCrossPrint(int[][] arr) {
        for (int s = 0; s < arr.length; s++) {
            System.out.print("[");
            for (int r = 0; r < arr.length; r++) {
                System.out.print(arr[s][r] + "  ");
            }
            System.out.print("\b\b]");
            System.out.println();
        }
        System.out.println();
    }

    //Задание 14
    private static int[] arrLenValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int t = 0; t < arr.length; t++) {
            arr[t] = initialValue;
        }
        return arr;
    }


    //Далее следует вывод в командную строку решений задач путем вызова из метода main
    public static void main(String[] args) {

        //вывод в командную строку решения задания 1
        System.out.print("ЗАДАНИЕ 1: ");
        String words = printThreeWords();
        System.out.println(words);

        //вывод в командную строку решения задания 2
        System.out.println("ЗАДАНИЕ 2:");
        checkSumSign(-4, 3);
        System.out.println();

        //выводим в командную строку решение задания 3
        System.out.println("\nЗАДАНИЕ 3:");
        printColor(-100);
        System.out.println();

        //выводим в командную строку решение задания 4
        System.out.println("Задание 4");
        compareNumbers(4, 5);
        System.out.println();

        //выводим в командную строку решение задания 5
        System.out.println("\nЗадание 5");
        boolean range = sumInRange(5, 10);
        System.out.println(range);

        //выводим в командную строку решение задания 6
        System.out.println("\nЗадание 6");
        posNegative(-50);
        System.out.println();

        //выводим в командную строку решение задания 7
        System.out.println("\nЗадание 7");
        trueNegative(-8);

        //выводим в командную строку решение задания 8
        System.out.println("\nЗадание 8");
        counterPrint("Обратный отсчет: ", 9);

        //выводим в командную строку решение задания 9
        System.out.println("\nЗадание 9");
        isLeapYear(800);
        System.out.println();

        //выводим в командную строку решение задания 10
        System.out.println("\nЗадание 10");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        arraySwap(arr);
        System.out.println(Arrays.toString(arr));

        //выводим в командную строку решение задания 11
        System.out.println("\nЗадание 11");
        int[] arr2 = new int[100];
        array100(arr2);
        System.out.println(Arrays.toString(arr2));

        //выводим в командную строку решение задания 12
        System.out.println("\nЗадание 12");
        int[] arr3 = {5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrMult(arr3);
        System.out.println(Arrays.toString(arr3));

        //выводим в командную строку решение задания 13
        System.out.println("\nЗадание 13");
        int x = 5;
        int[][] arr4 = new int[x][x];
        arrCrossFill(arr4);
        arrCrossPrint(arr4);

        //выводим в командную строку решение задания 14
        System.out.println("\nЗадание 14");
        int arr6 = 10;
        int arr7 = 7;
        int[] result = arrLenValue(arr6, arr7);
        System.out.println(Arrays.toString(result));
    }
}



