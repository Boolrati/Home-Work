package Aston.Lesson_6;
import java.util.HashSet;
import java.util.HashMap;

public class WordsClass {
   public static HashSet<String> UniqueWords(String[] words) {
       HashSet<String> uniqueWords = new HashSet<>();
       for (String word : words) {
           uniqueWords.add(word);
       }
       return uniqueWords;
   }
   public static HashMap<String, Integer> CountWords(String[] words) {
       HashMap<String, Integer> countWords = new HashMap<>();
       for(String word : words){
           if (countWords.containsKey(word)) {
               int count = countWords.get(word);
               countWords.put(word, count+1);
           }
           else {
               countWords.put(word,1);
           }
       }
       return countWords;
   }
}

