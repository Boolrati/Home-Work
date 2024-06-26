package Aston.Lesson_4;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString(){
        return "Круг: Периметр = " + calculatePerimeter() + ", его площадь = " + calculateArea() + ", цвет заливки - " + FILL_COLOR + ", цвет линий - " + BORDER_COLOR;
    }
}
