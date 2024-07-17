package Aston.Lesson_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook{
    Map<String, Set<String>> users = new HashMap<>();

    public void add(String lastName, String phone){
        if (users.containsKey(lastName)){
            users.get(lastName).add(phone);
        }
        else{
            Set<String> phones = new HashSet<>();
            phones.add(phone);
            users.put(lastName,phones);
        }
    }

    public Set<String> get(String lastName){
        return users.get(lastName);
    }
}
