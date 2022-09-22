/*
 * A program that shows information about a general shape
 * Author: Awonke Mnotoza
 * Date: 22 September 2022
 * Student number: MNTAWO002
 */

public class Shape {
    // & Initializing the variables
    public String name;
    public String colour;

    // & Initializing the constructor
    public Shape(String name, String colour) {
        this.name = name;
        this.colour = colour;

        this.toString();
    }

    public Shape(Shape s) { // ^ Copy constructor
        this(s.name, s.colour);
    }

    // & Formatting the variables into a string
    public String toString() {
        return String.format("%s %s", name, colour);
    }
}
