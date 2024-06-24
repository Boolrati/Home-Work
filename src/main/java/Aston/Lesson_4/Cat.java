package Aston.Lesson_4;

public class Cat extends Animal{
    private String name;
    private boolean satiety; //сытость кота
    private int eat; //сколько кот хочет съесть из миски

    static int countCat = 0;

    public Cat(String name){
        super();
        countCat++;
        this.name = name;

    }

    public Cat(String name, int eat){
        this.name = name;
        this.satiety = false; //изначально сытость = false
        this.eat = eat;  //сколько котик хочет съесть из миски
    }

    @Override
    public String toString() {
        return "Кот: " + name + " | хочет съесть: " + eat + "| Сытость: " + satiety;
    }

    public void eat(Bowl bowl){
        if (bowl.getFoodCount() > eat){
            bowl.decreaseFoodCount(eat);
            satiety = true;
        }
    }


    @Override
    public void swim(int distance) {
    System.out.println("Кот " + name + " не проплыл " + distance + " м. ибо коты не умеют плавать!");

}

    @Override
    public void run(int distance) {
        if (distance > CAT_MAX_RUN) {
            System.out.println("Кот " +name+ " не может пробежать больше "+ CAT_MAX_RUN + " м.");
        } else {
            System.out.println("Кот " +name + " пробежал " + distance + " м.");
        }System.out.println(" ");
    }

    public void eating(Bowl bowl){
        if(bowl.getFoodCount()>=eat){
            bowl.decreaseFoodCount(eat);
            satiety=true;
        }
    }

    static int getCountCat(){
        return countCat;
    }
}
