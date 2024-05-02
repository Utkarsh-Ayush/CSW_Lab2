package Assignment2.Q3;

// Car class implementing Comparable interface
class Car implements Comparable<Car> {
    private String model;
    private String color;
    double speed;

    
    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    
    @Override
    public int compareTo(Car other){
     return Double.compare(this.speed, other.speed);
   }
 

    
    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }
}

public class driver {
    public static void main(String[] args) {
        // Create two car objects
        Car car1 = new Car("Bugati Chiron", "Red", 250.0);
        Car car2 = new Car("Lamborghini Avandator", "Blue", 300.0);

        // Compare car objects based on speed
        int comparisonResult = car1.compareTo(car2);
        if (comparisonResult < 0) {
            System.out.println("Car 2 (" + car2.speed + ") is faster.");
            System.out.println(car2);
        } else if (comparisonResult > 0) {
            System.out.println("Car 1 (" + car1.speed + ") is faster.");
            System.out.println(car1);
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}
