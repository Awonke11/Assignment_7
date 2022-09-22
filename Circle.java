/*
 * A program that shows information about a circle
 * Author: Awonke Mnotoza
 * Date: 22 September 2022
 * Student number: MNTAWO002
 */

public class Circle extends Shape {

    public double radius; // ^ Additional Circle radius

    public Circle(String name, String colour, double radius) {
        super(name, colour); // * Inherits the parent constructor
        this.radius = radius;
    }

    public Circle(Circle c) { // ^ Copy constructor
        this(c.name, c.colour, c.radius);
    }

    // ^ Override the parent class to String to add the additional variable
    @Override
    public String toString() {
        return String.format("%s %s Radius %.1f", name, colour, radius);
    }
}