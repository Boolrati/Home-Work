package Aston.Lesson_4;

public class Rectangle implements Shape{
    private double height;
    private double width;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public String toString(){
        return "Прямоугольник: его периметр = " + calculatePerimeter() + ", его площадь = " + calculateArea() + ", цвет заливки - " + FILL_COLOR + ", цвет линий - " + BORDER_COLOR;
    }
}
