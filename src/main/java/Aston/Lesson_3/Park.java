package Aston.Lesson_3;

//Задача 3
class Park {
    private Attraction[] attractions = new Attraction[3];

    public Park() {
        attractions[0] = new Attraction("Rollercoaster", "10:00 - 22:00", 5.5);
        attractions[1] = new Attraction("Carousell", "10:00 - 21:30", 4.0);
        attractions[2] = new Attraction("Dragon's Nest", "10:00 - 21:30", 5.0);
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
