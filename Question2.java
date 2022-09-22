import java.util.Scanner;
/*
 * A program that gets information about a vehicle and the driver
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // & Get the User input
        System.out.println("Enter the vehicle manufacturer:");
        String vehicleManufacturer = input.nextLine();

        System.out.println("Enter the name of the vehicle owner:");
        String vehicleOwner = input.nextLine();

        System.out.println("Enter the owner's gender:");
        String ownerGender = input.nextLine();

        System.out.println("Enter the owner's programme of study:");
        String programOfStudy = input.nextLine();

        System.out.println("Enter the owner's Institution name:");
        String nameOfnameOfInstitution = input.nextLine();

        System.out.println("Enter the owner's hobbies:");
        String ownerHobbies = input.nextLine();

        System.out.println("Enter the owner's age:");
        int ageOfOwner = input.nextInt();

        System.out.println("Enter the number of cylinders in the engine:");
        int cylinders = input.nextInt();

        System.out.println("Enter the car seating capacity:");
        int carCapacity = input.nextInt();

        System.out.println("Enter the weight of the car:");
        double carWeight = input.nextDouble();

        // ^ Creating the student object
        Student student = new Student(vehicleOwner, ageOfOwner, ownerGender, nameOfnameOfInstitution, programOfStudy,
                ownerHobbies);
        // ^ Creating the car object
        Car car = new Car(cylinders, vehicleManufacturer, student, carCapacity, carWeight);
        System.out.println(car.toString());

        input.close();
    }
}
