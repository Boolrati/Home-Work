package Aston.Lesson_4;

public class Dog extends Animal {
    String name;
    static int countDog = 0;

    public Dog(String name){
        super();
        countDog++;
        this.name = name;
    }
    @Override
    public void run(int distance) {
        if (distance > DOG_MAX_RUN) {
            System.out.println(name+ " не может пробежать больше " + DOG_MAX_RUN + " м.");
        } else {
            System.out.println(name+ " пробежал " + distance + " м.");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance > DOG_MAX_SWIM) {
            System.out.println(name+ " не может проплыть больше " +DOG_MAX_SWIM+ " м.");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }

    static int getCountDog (){
        return countDog;
    }
}
