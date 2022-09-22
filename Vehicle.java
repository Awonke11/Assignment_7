/*
 * A program that shows the information of a vehicle
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */

public class Vehicle {
    // & Initializing the variables
    public int cylinders;
    public String manufacturer;
    public Student owner;

    // & Constructor
    public Vehicle(int numCylinders, String maker, Student owner) {
        this.cylinders = numCylinders;
        this.manufacturer = maker;
        this.owner = owner;
    }

    // & Constructor Copy
    public Vehicle(Vehicle v) {
        this(v.cylinders, v.manufacturer, v.owner); // ^ this == Vehicle Object
    }

    // & String presentation of the information
    public String toString() {
        return String.format("Number of Cylinders: %d \nName of Manufacturer: %s \nOwner: %s", this.cylinders,
                this.manufacturer, this.owner.getName());
    }
}
