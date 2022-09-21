/*
 * A program that shows the information of a vehicle
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */

public class Vehicle {
    // & Initializing the variables
    public int numberOfCylinders;
    public String nameOfManufacturer;
    public Student owner;

    // & Constructor
    public Vehicle(int numCylinders, String maker, Student owner) {
        this.numberOfCylinders = numCylinders;
        this.nameOfManufacturer = maker;
        this.owner = owner;
    }

    // & Constructor Copy
    public Vehicle(Vehicle v) {
        this(v.numberOfCylinders, v.nameOfManufacturer, v.owner); // ^ this == Vehicle Object
    }

    // & String presentation of the information
    public String toString() {
        return String.format("Number of Cylinders: %d \nName of Manufacturer: %s \nOwner: %s", this.numberOfCylinders,
                this.nameOfManufacturer, this.owner.getPersonName());
    }
}
