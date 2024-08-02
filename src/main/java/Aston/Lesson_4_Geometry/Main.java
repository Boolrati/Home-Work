package Aston.Lesson_4_Geometry;

public class Main {
    public static void main(String[] args) {

        //Задача 3
        Circle circle = new Circle(6, "Желтый", "Черный");
        Rectangle rectangle = new Rectangle(3, 4, "Пурпурный", "Оранжевый");
        Triangle triangle = new Triangle(7, 8, 9, "Красный", "Синий");
        System.out.println(" ");
        System.out.println("Задание 3\n");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
