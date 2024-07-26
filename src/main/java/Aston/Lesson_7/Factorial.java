package Aston.Lesson_7;

public class Factorial {
    public static int number(int n){
        int result = 1;
        for (int i=1; i<=n;i++){
            result *=i;
        }
        return result;
    }
}
