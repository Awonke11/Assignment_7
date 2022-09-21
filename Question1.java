/*
 * A program that o demonstrate the use of inheritance by creating and outputting 3 simple objects, where the classes for the second and third objects inherit from the class for the first object.
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student Number: MNTAWO002
 * 
 */
class Question1 {
   public static void main(String args[]) {
      System.out.println(new Shape("Pentagon", "Blue"));
      System.out.println(new Circle("Circle", "Purple", 3));
      System.out.println(new Rectangle("Rectangle", "Red", 6, 8));
   }
}

class Shape {
   // & Initializing the variables
   protected String shapeName;
   protected String shapeColor;

   // & Initializing the constructor
   Shape(String shapeName, String shapeColor) {
      this.shapeName = shapeName;
      this.shapeColor = shapeColor;
   }

   // & Formatting the variables into a string
   public String toString() {
      return String.format("%s %s", shapeName, shapeColor);
   }
}

class Circle extends Shape {

   protected double circleRadius; // ^ Additional Circle radius

   Circle(String shapeName, String shapeColor, double circleRadius) {
      super(shapeName, shapeColor); // * Inherits the parent constructor
      this.circleRadius = circleRadius;

      this.toString();
   }

   // ^ Override the parent class to String to add the additional variable
   public String toString() {
      return String.format("%s %s Radius %.1f", shapeName, shapeColor, circleRadius);
   }
}

class Rectangle extends Shape {
   protected double height, width; // ^ Initialized additional variables

   Rectangle(String shapeName, String shapeColor, double height, double width) {
      super(shapeName, shapeColor); // * Inherits the parent constructor
      this.height = height;
      this.width = width;
   }

   // ^ Override the parent class to String to add the additional variable
   public String toString() {
      return String.format("%s %s Length %.1f Width %.1f", shapeName, shapeColor, this.height, this.width);
   }
}