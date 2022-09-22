public class Shape {
    // & Initializing the variables
    public String name;
    public String color;

    // & Initializing the constructor
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;

        this.toString();
    }

    // & Formatting the variables into a string
    public String toString() {
        return String.format("%s %s", name, color);
    }
}
