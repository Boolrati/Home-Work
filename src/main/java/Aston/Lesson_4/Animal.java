package Aston.Lesson_4;

public class Animal {
    final static int CAT_MAX_RUN = 200;
    final static int DOG_MAX_RUN = 500;
    final static int DOG_MAX_SWIM = 10;
    static int countAnimal = 0;
    Animal(){
        countAnimal++;
    }

    public void run(int distance){
        System.out.println("Животное пробежало "+distance+" метров.");

    }
    public void swim(int distance){
        System.out.println("Животное проплыло "+distance+" метров.");

    }
    public static int getCountAnimal(){
        return countAnimal;
    }
}




