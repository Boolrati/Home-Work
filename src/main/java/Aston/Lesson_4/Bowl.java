package Aston.Lesson_4;

public class Bowl {
    private int foodCount;
    public Bowl(int foodCount){
        this.foodCount = foodCount;
    }
    @Override
    public String toString(){
        return "Миска: " + foodCount;
    }

    void decreaseFoodCount(int eat){
        if (foodCount>=eat){
        foodCount -= eat;
        }
        }
    int getFoodCount(){
        return foodCount;
    }

    void addFood(int amount){
        foodCount += amount;
    }
}
