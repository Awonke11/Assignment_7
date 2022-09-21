public class Car extends Vehicle {
    public static int capacity;
    public static double weight;

    public Car(int numCylinders, String maker, Student owner, int passengers, double carWeight) {
        super(numCylinders, maker, owner);
        capacity = passengers;
        weight = carWeight;
    }

    public Car(Car c) {
        this(c.numberOfCylinders, c.nameOfManufacturer, c.owner, capacity, weight); // ^ this == Car Object
    }
}
