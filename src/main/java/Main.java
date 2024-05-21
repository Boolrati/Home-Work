import java.util.Arrays;

class HomeWork {
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
    public static void counterPrint(String text, int times) {
        for (int a = 0; a < times; a++) {
            //return text, times;
            System.out.println(text);
        }
        //return text;
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
    private static int[] arraySwap(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int[] arr;
        arr = new int[10];
        for (int h = 0; h < arr.length; h++) {
            if (arr[h] == 0) {
                arr[h] =1;
            }
            else if (arr[h] ==1) {
                arr[h] = 0;
            }
        }

        return arr;
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
        //System.out.println("\nЗадание 8");
        //x = counterPrint("Обратный отсчет: ", 9);
        //for (int y = 0; y < x; y++) {
        //System.out.println(x);

        //}

        //выводим в командную строку решение задания 9
        System.out.println("\nЗадание 9");
        boolean d = isLeapYear(800);
        System.out.println(d);

        //выводим в командную строку решение задания 10
        System.out.println("\nЗадание 10");
        int[] arr1=arraySwap(1, 1, 0, 0, 1, 0, 1, 1, 0, 0);
            System.out.println(Arrays.toString(arr1));



    }


}