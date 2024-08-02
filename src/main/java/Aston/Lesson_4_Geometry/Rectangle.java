package Aston.Lesson_4_Geometry;

public class Rectangle implements Shape {
    private double height;
    private double width;
    private String fill_color;
    private String border_color;

    public Rectangle(double width, double height, String fill_color, String border_color) {
        this.height = height;
        this.width = width;
        this.fill_color = fill_color;
        this.border_color = border_color;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник: его периметр = " + calculatePerimeter() + ", его площадь = " + calculateArea() + ", цвет заливки - " + fill_color + ", цвет линий - " + border_color;
    }
}
