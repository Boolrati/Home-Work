package Aston.Lesson_4;

public interface Shape {

    String FILL_COLOR1 = "Желтый";
    String BORDER_COLOR1 = "Черный";
    String FILL_COLOR2 = "Пурпурный";
    String BORDER_COLOR2 = "Оранжевый";
    String FILL_COLOR3 = "Красный";
    String BORDER_COLOR3 = "Синий";

    default double calculatePerimeter(){
        int radius = 4;
        return 2*Math.PI*radius;
    };
    double calculateArea();
}
