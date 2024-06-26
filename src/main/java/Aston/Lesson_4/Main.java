package Aston.Lesson_4;

public class Main {
    public static void main(String[] args) {
        //Задача 1

        Animal catBarsik = new Cat("Барсик");
        catBarsik.swim(150);
        catBarsik.run(190);
        Animal catPushok = new Cat("Пушок");
        catPushok.swim(5);
        catPushok.run(220);
        Animal dogBobik = new Dog("Бобик");
        dogBobik.swim(10);
        dogBobik.run(5000);
        Animal dogBarbos = new Dog("Барбос");
        dogBarbos.swim(550);
        dogBarbos.run(300);
        System.out.println("Всего создано животных: " +Animal.getCountAnimal());
        System.out.println("Всего котов: "+Cat.getCountCat());
        System.out.println("Всего собак: "+Dog.getCountDog());

        //Задача 2

        System.out.println("\nЗадание 2\n");
        Cat[] pets = {
                new Cat("Мышка", 7),
                new Cat("Дымка", 10),
                new Cat("Ласка", 15),
                new Cat("Шанти", 5),
                new Cat("Ромашка", 8),
                new Cat("Кэсси", 12),
                new Cat("Васька", 5)
        };
        Bowl bowl = new Bowl(50);
        for (Cat c : pets){
            System.out.println(c);
        }
        System.out.println("\n" + bowl);
        System.out.println("\nдобавить еды в миску");
        bowl.addFood(10);
        System.out.println(bowl);
        System.out.println("Коты едят из миски:");
        for(Cat c : pets) {
            c.eat(bowl);
            System.out.println(c);
            System.out.println(bowl);
        }

        //Задача 3

        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(3,4);
        Triangle triangle = new Triangle(7,8,9);

        System.out.println(" ");
        System.out.println("Задание 3\n");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
