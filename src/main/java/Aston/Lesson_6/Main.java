package Aston.Lesson_6;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String[] words = {
                "красный",
                "синий",
                "белый",
                "синий",
                "зеленый",
                "желтый",
                "белый",
                "оранжевый",
                "бежевый",
                "синий",
                "красный",
                "зеленый",
                "белый",
                "синий",
                "голубой",
                "фисташковый",
                "бордовый",
                "коричневый",
                "фисташковый"};

        Set<String> uniqueWords = WordsClass.UniqueWords(words);
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordOccurances = WordsClass.CountWords(words);
        System.out.println("Всего слов: " + wordOccurances);

        System.out.println("\nЗадание 2");
PhoneBook phonebook = new PhoneBook();
phonebook.add("Иванов", "+375291112266");
phonebook.add("Петров","+375291122333");
phonebook.add("Сидоров","+3752911122333");
phonebook.add("Сидоров","+3753311122334");
phonebook.add("Васькин","+3754411122335");
phonebook.add("Скайвокер","+375292224455");
phonebook.add("Сидоров","+3754411122333");

System.out.println("Номера телефонов Сидорова: ");
Set<String> numbers = phonebook.get("Сидоров");
for(String number : numbers){
    System.out.println(number);
}
    }
}
