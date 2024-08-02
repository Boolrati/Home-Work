package Aston.Lesson_5;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "-8"}};
        try {
            int sum = arrMethod(arr);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Исключение размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке: " + e.getMessage());
        }
    }

    public static int arrMethod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4 || arr[1].length != 4 || arr[2].length != 4 || arr[3].length != 4) {
            throw new MyArraySizeException("Массив должен быть 4х4!");
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неправильное значение в (" + i + "," + j + ")", i, j);
                }
            }
        }
        return sum;


    }

}