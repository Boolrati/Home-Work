package Aston.Lesson_4_Geometry;

public class Circle implements Shape {
    private double radius;
    private String fill_color;
    private String border_color;

    public Circle(double radius, String fill_color, String border_color) {
        this.radius = radius;
        this.fill_color = fill_color;
        this.border_color = border_color;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг: Периметр = " + calculatePerimeter() + ", его площадь = " + calculateArea() + ", цвет заливки - " + fill_color + ", цвет линий - " + border_color;
    }
}
