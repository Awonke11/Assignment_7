/*
 * A person class that takes in personal details
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */

public class Person {
    public static String personName;
    public static int personAge;
    public static String personGender;

    public Person(String name, int age, String gender) {
        personName = name;
        personAge = age;
        personGender = gender;
    }

    // ^ Accessor Methods - Getters
    public String getPersonName() { // & personName
        return personName;
    }

    public int getPersonAge() { // & personAge
        return personAge;
    }

    public String getPersonGender() { // & personGender
        return personGender;
    }

    // ^ Mutator Methods - Setters
    public void setPersonName(String name) { // & personName
        personName = name;
    }

    public void setPersonAge(int age) { // & personAge
        personAge = age;
    }

    public void setPersonGender(String gender) { // & personGender
        personGender = gender;
    }

    public String toString() {
        return String.format("Name: %s \nAge: %d \nGender: %s", personName, personAge, personGender);
    }
}
