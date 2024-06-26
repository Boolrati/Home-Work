package Aston.Lesson_4;

public interface Shape {
    String FILL_COLOR = "Желтый";
    String BORDER_COLOR = "Черный";

    default double calculatePerimeter(){
        int radius = 4;
        return 2*Math.PI*radius;
    };
    double calculateArea();
}
