package Aston.Lesson_4_Geometry;

public interface Shape {

    default double calculatePerimeter() {
        int radius = 4;
        return 2 * Math.PI * radius;
    }

    default double calculateArea(){
        int radius = 5;
        return Math.PI * radius * radius;
    };
}
