package Aston.Lesson_4;

public class Triangle implements Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }
//вычислим площадь треугольника по формуле Герона
    @Override
    public double calculateArea(){
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }

        @Override
    public String toString(){
        return "Треугольник: его периметр = " + calculatePerimeter() + ", его площадь = " + calculateArea() + ", цвет заливки - " + FILL_COLOR3 + ", цвет линий - " + BORDER_COLOR3;
    }
}
