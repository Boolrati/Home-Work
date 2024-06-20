package Aston.Lesson_4;

public class Main {
    public static void main(String[] args) {
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
    }
}
