/*
 * A program that obtains infomation about a car
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */

public class Car extends Vehicle {
    // & Initialized the variables
    public static int capacity;
    public static double weight;

    public Car(int numCylinders, String maker, Student owner, int passengers, double carWeight) {
        super(numCylinders, maker, owner); // ^ Inherits the constructor from the parent class
        capacity = passengers;
        weight = carWeight;
    }

    public Car(Car c) {
        this(c.cylinders, c.manufacturer, c.owner, capacity, weight); // ^ this == Car Object
    }

    @Override
    public String toString() { // ^ String presentation of this object
        return String.format(
                "%s, %d cylinders, owned by %s, a %d-year old %s studying %s at %s. %s likes %s.\nThe car is a %d-seater weighing %.1f kg",
                this.manufacturer, this.cylinders, this.owner.getName(), this.owner.getAge(),
                this.owner.getGender(), this.owner.getProgramOfStudy(), this.owner.getNameOfInstitution(),
                this.owner.getName(), this.owner.getHobbies(), capacity, weight);
    }
}
