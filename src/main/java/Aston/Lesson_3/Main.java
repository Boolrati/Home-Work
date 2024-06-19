package Aston.Lesson_3;

//import java.util.Arrays;

public class Main {
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
}








