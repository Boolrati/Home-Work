package Aston.Lesson_4_Geometry;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String fill_color;
    private String border_color;

    public Triangle(double side1, double side2, double side3, String fill_color, String border_color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fill_color = fill_color;
        this.border_color = border_color;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    //вычислим площадь треугольника по формуле Герона
    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Треугольник: его периметр = " + calculatePerimeter() + ", его площадь = " + calculateArea() + ", цвет заливки - " + fill_color + ", цвет линий - " + border_color;
    }
}
