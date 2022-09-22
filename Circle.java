public class Circle extends Shape {

    public double radius; // ^ Additional Circle radius

    Circle(String name, String color, double radius) {
        super(name, color); // * Inherits the parent constructor
        this.radius = radius;

        this.toString();
    }

    // ^ Override the parent class to String to add the additional variable
    @Override
    public String toString() {
        return String.format("%s %s Radius %.1f", name, color, radius);
    }
}