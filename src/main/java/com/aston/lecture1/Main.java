package com.aston.lecture1;

import java.util.Arrays;

class HomeWork {
    /*
    в первой части все задачи будут иметь только логику и объявление метода.
    Вызов метода для печати в консоль результатов всех задач будет в методе main во второй части
    */

    //Задание 1
    public static String printThreeWords(String words) {
        return "Три слова в столбец: " + words;
    }

    //Задание 2

    public static boolean checkSumSign(int a, int b) {
        if (a + b >= 0) return true;
        else return false;
    }

    //Задание 3

    private static int printColor(int a) {
        //return "Значение метода printColor(): " + a;
        return a;
    }

    //Задание 4
    public static boolean compareNumbers(int a, int b) {
        return a >= b;
    }

    //Задание 5
    public static boolean sumInRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20) return true;
        else return false;
    }

    //Задание 6
    public static boolean posNegative(int a) {
        if (a >= 0) return true;
        else return false;
    }

    //Задание 7
    public static boolean trueNegative(int a) {
        if (a < 0) return true;
        else return false;
    }

    //Задание 8 - не решенное
    public static String counterPrint(String text, int times) {
        //System.out.println(text);
        for (int a = 0; a < times; a++) return text;
        return text;
    }

    //Задание 9
    public static boolean isLeapYear(int y) {
        boolean year4 = (y % 4 == 0);
        boolean yearHundred = (y % 100 != 0);
        boolean year4Hundred = (y % 400 ==0);
        if (year4 || yearHundred && year4Hundred) {
            return true;
        } else return false;
    }

    //Задание 10
    public static int[] arraySwap(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int[] arr = new int[10];
        for (int h = 0; h < arr.length; h++) {
            arr[h]= arr[h]==1? 0:1;
            //if (arr[h] != 1) {
               // if (arr[h] == 0) arr[h]=1;
           // } else {
            //    arr[h] = 0;
            //}
        }
        return arr;
    }

    //Задание 11
    public static int[] array100(){
       int n[] = new int[100];
       for (int k = 0; k < n.length; k++) {
           n[k] = k+1;
       }
        return n;
    }

    //Задание 12
    public static int[] arrMult(int i11, int i12, int i13,int i14, int i15,int i16, int i17, int i18, int i19, int i20, int i21, int i22){
    int m[] = new int[12];
    for (int l = 0; l < m.length; l++) {
        if (m[l] <6){
            m[l] = m[l]*2;
        }
    }
        return m;
    }

    //Задание 13
    public static int[][] arrCross(int x, int y) {
        int[][] table = new int[5][5];
        for (int s = 0; s < table.length; s++) {
            table[s][table.length - s - 1] = 1;
        }
        for (int s = 0; s < table.length; s++) {
            for (int r = 0; r < table.length; r++) {
                table[s][s] = 1;
            }
            System.out.println();
        }
        return table;

    }



    //Далее следует вывод в командную строку решений задач путем вызова из метода main
    public static void main(String[] args) {

        //вывод в командную строку решения задания 1
        System.out.print("ЗАДАНИЕ 1: ");
        String words = printThreeWords("\nOrange\nBanana\nApple\n");
        System.out.println(words);

        //вывод в командную строку решения задания 2
        System.out.println("ЗАДАНИЕ 2:");
        boolean c = checkSumSign(-4, 3);
        if (c) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

        //выводим в командную строку решение задания 3
        System.out.println("\nЗАДАНИЕ 3:");
        int b = printColor(500);
        if (b <= 0) System.out.println("Красный\n");
        else if (b > 0 && b <= 100) System.out.println("Желтый\n");
        else if (b > 100) System.out.println("Зеленый\n");

        //выводим в командную строку решение задания 4
        System.out.println("Задание 4");
        boolean dif = compareNumbers(4, 3);
        if (dif) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

        //выводим в командную строку решение задания 5
        System.out.println("\nЗадание 5");
        boolean range = sumInRange(5, 10);
        System.out.println(range);

        //выводим в командную строку решение задания 6
        System.out.println("\nЗадание 6");
        boolean num = posNegative(-50);
        if (num) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

        //выводим в командную строку решение задания 7
        System.out.println("\nЗадание 7");
        boolean num1 = trueNegative(0);
        if (num1) {
            System.out.println(num1);
        } else {
            System.out.println(false);
        }

        //выводим в командную строку решение задания 8
        System.out.println("\nЗадание 8");
        String x = counterPrint("Обратный отсчет: ", 9);
        //for (int y = 0; y < x; y++) {
        System.out.println(x);

        //}

        //выводим в командную строку решение задания 9
        System.out.println("\nЗадание 9");
        boolean d = isLeapYear(800);
        System.out.println(d);

        //выводим в командную строку решение задания 10
        System.out.println("\nЗадание 10");
        int[] arr1=arraySwap(1, 1, 0, 0, 1, 0, 1, 1, 0, 0);
            System.out.println(Arrays.toString(arr1));


        //выводим в командную строку решение задания 11
        System.out.println("\nЗадание 11");
        int[] arr2 = array100();
        System.out.println(Arrays.toString(arr2));

        //выводим в командную строку решение задания 12
        System.out.println("\nЗадание 12");
        int[] arr3 = arrMult(1,5,3,2,11,4,5,2,4,8,9,1);
        System.out.println(Arrays.toString(arr3));

        //выводим в командную строку решение задания 13
        System.out.println("\nЗадание 13");
        int[][] arr4 = arrCross(5,5);
        System.out.println(Arrays.deepToString(arr4));



    }


}