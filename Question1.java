/*
 * A program that o demonstrate the use of inheritance by creating and outputting 3 simple objects, where the classes for the second and third objects inherit from the class for the first object.
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student Number: MNTAWO002
 * 
 */
public class Question1 {
   public static void main(String args[]) {
      System.out.println(new Shape("Pentagon", "Blue"));
      System.out.println(new Circle("Circle", "Purple", 3));
      System.out.println(new Rectangle("Rectangle", "Red", 6, 8));
   }
}

class Shape {
   // & Initializing the variables
   public String name;
   public String color;

   // & Initializing the constructor
   Shape(String name, String color) {
      this.name = name;
      this.color = color;
   }

   // & Formatting the variables into a string
   public String toString() {
      return String.format("%s %s", name, color);
   }
}

class Circle extends Shape {

   public double radius; // ^ Additional Circle radius

   Circle(String name, String color, double radius) {
      super(name, color); // * Inherits the parent constructor
      this.radius = radius;

      this.toString();
   }

   // ^ Override the parent class to String to add the additional variable
   public String toString() {
      return String.format("%s %s Radius %.1f", name, color, radius);
   }
}

class Rectangle extends Shape {
   public double length, width; // ^ Initialized additional variables

   Rectangle(String name, String color, double length, double width) {
      super(name, color); // * Inherits the parent constructor
      this.length = length;
      this.width = width;
   }

   // ^ Override the parent class to String to add the additional variable
   public String toString() {
      return String.format("%s %s Length %.1f Width %.1f", name, color, this.length, this.width);
   }
}