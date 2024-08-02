package Lesson_4_Animals;

public class Bowl {
    private int foodCount;

    public Bowl(int foodCount) {
        this.foodCount = foodCount;
    }

    @Override
    public String toString() {
        return "Миска: " + foodCount;
    }

    void decreaseFoodCount(int foodToEatCount) {
        if (foodCount >= foodToEatCount) {
            foodCount -= foodToEatCount;
        }
    }

    int getFoodCount() {
        return foodCount;
    }

    void addFood(int amount) {
        foodCount += amount;
    }
}
