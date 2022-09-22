/*
 * A program that o demonstrate the use of inheritance by creating and outputting 3 simple objects, where the classes for the second and third objects inherit from the class for the first object.
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student Number: MNTAWO002
 */
public class Question1 {
   public static void main(String args[]) {
      System.out.println(new Shape("Pentagon", "Blue"));
      System.out.println(new Circle("Circle", "Purple", 3));
      System.out.println(new Rectangle("Rectangle", "Red", 6, 8));
   }
}
