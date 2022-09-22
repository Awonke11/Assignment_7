public class Rectangle extends Shape {
    public double length, width; // ^ Initialized additional variables

    Rectangle(String name, String color, double length, double width) {
        super(name, color); // * Inherits the parent constructor
        this.length = length;
        this.width = width;
    }

    // ^ Override the parent class to String to add the additional variable
    @Override
    public String toString() {
        return String.format("%s %s Length %.1f Width %.1f", name, color, this.length, this.width);
    }
}