package Lesson_4_Animals;

public class Cat extends Animal {
    private String name;
    private boolean satiety; //сытость кота
    static int countCat = 0;

    public Cat(String name) {
        super();
        countCat++;
        this.name = name;
        this.satiety = false; //изначально сытость = false
    }

    @Override
    public String toString() {
        return "Кот: " + name + /*" | хочет съесть: " + foodToEatCount +*/ "| Сытость: " + satiety;
    }

    public void eat(Bowl bowl, int foodToEatCount) {
        if (bowl.getFoodCount() >= foodToEatCount) {
            bowl.decreaseFoodCount(foodToEatCount);
            satiety = true;
            System.out.println(name + " съел " + foodToEatCount + " еды");
        } else {
            System.out.println("Не хватает еды в миске");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не проплыл " + distance + " м. ибо коты не умеют плавать!");
    }

    @Override
    public void run(int distance) {
        if (distance > CAT_MAX_RUN) {
            System.out.println("Кот " + name + " не может пробежать больше " + CAT_MAX_RUN + " м.");
        } else {
            System.out.println("Кот " + name + " пробежал " + distance + " м.");
        }
        System.out.println(" ");
    }

    static int getCountCat() {
        return countCat;
    }
}
