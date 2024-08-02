package Lesson_4_Animals;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("\nЗадание 1\n");
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
        System.out.println("Всего создано животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDog());

        //Задача 2

        System.out.println("\nЗадание 2\n");
        Cat[] pets = {
                new Cat("Мышка"),
                new Cat("Дымка"),
                new Cat("Ласка"),
                new Cat("Шанти"),
                new Cat("Ромашка"),
                new Cat("Кэсси"),
                new Cat("Васька")
        };
        Bowl bowl = new Bowl(70);
        for (Cat c : pets) {
            System.out.println(c);
        }
        System.out.println("\n" + bowl);
        System.out.println("\nдобавить еды в миску");
        bowl.addFood(20);
        System.out.println(bowl);
        System.out.println("\nКоты едят из миски:");
        for (Cat c : pets) {
            c.eat(bowl, 15);
            System.out.println(c);
            System.out.println(bowl);
        }
    }
}
