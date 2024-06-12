package Aston.Lesson_3;

//import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Designer", "petrov@mailbox.com", "892312313", 40000, 35);
        persArray[2] = new Employee("Sidorov Sidr", "SEO", "sidorov@mailbox.com", "892312314", 25000, 33);
        persArray[3] = new Employee("Cris Hamsword", "Cleaner", "hamsword@mailbox.com", "892312315", 5000, 45);
        persArray[4] = new Employee("Jakie Chan", "Security", "chan@mailbox.com", "892312316", 300000, 60);
        for (Employee employee : persArray) {
            employee.printEmployee();
        }
    }
    static class Employee {
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
}

//Задача 3
class Park {
    private Attraction[] attractions = new Attraction[3];

    public Park() {
        attractions[0] = new Attraction("Rollercoaster","10:00 - 22:00", 5.5);
        attractions[1] = new Attraction("Carousell","10:00 - 21:30",4.0);
        attractions[2] = new Attraction("Dragon's Nest","10:00 - 21:30",5.0);
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }


    }
}







