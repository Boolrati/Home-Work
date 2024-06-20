package Aston.Lesson_4;

public class Cat extends Animal{
    String name;
    static int countCat = 0;

    public Cat(String name){
        super();
        countCat++;
        this.name=name;

    }@Override
    public void swim(int distance) {
    System.out.println("Кот " + name + " не проплыл " + distance + " м. ибо коты не умеют плавать!");

}
    @Override
    public void run(int distance) {
        if (distance > CAT_MAX_RUN) {
            System.out.println("Кот " +name+ " не может пробежать больше "+ CAT_MAX_RUN + " м.");
        } else {
            System.out.println("Кот " +name + " пробежал " + distance + " м.");
        }
    }
    static int getCountCat(){
        return countCat;
    }
}
