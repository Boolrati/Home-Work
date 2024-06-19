package Aston.Lesson_3;

public class Employee {
        private String name, position, email, phone;
        private int salary, age;


        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        //метод для вывода информации о сотруднике

        public String toString() {
            return name + ":\t " + position + "\t " + email + "\t " + phone + "\t " + salary + "\t" + age + "\t ";
        }
        public void printEmployee() {
            System.out.println(this);

        }
    }
