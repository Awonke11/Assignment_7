/*
 * A person class that takes in personal details
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */

public class Person {
    // & Initializing the variables
    public String name;
    public int age;
    public String gender;

    public Person(Person p) { // ^ Copy constructor
        this(p.name, p.age, p.gender);
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // ^ Accessor Methods - Getters
    public String getName() { // & name
        return this.name;
    }

    public int getAge() { // & age
        return this.age;
    }

    public String getGender() { // & gender
        return this.gender;
    }

    // ^ Mutator Methods - Setters
    public void setName(String name) { // & name
        this.name = name;
    }

    public void setAge(int age) { // & age
        this.age = age;
    }

    public void setGender(String gender) { // & gender
        this.gender = gender;
    }
}
