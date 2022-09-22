/*
 * A program that shows information about a rectangle
 * Author: Awonke Mnotoza
 * Date: 22 September 2022
 * Student number: MNTAWO002
 */

public class Rectangle extends Shape {
    public double length, width; // ^ Initialized additional variables

    public Rectangle(String name, String colour, double length, double width) {
        super(name, colour); // * Inherits the parent constructor
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle r) { // ^ Copy constructor
        this(r.name, r.colour, r.length, r.width);
    }

    // ^ Override the parent class to String to add the additional variable
    @Override
    public String toString() {
        return String.format("%s %s Length %.1f Width %.1f", name, colour, this.length, this.width);
    }
}