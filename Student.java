/*
 * A program thats creates a Student Object 
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */
public class Student extends Person {
    // & Initialized the variables
    public String nameOfInstitution;
    public String programOfStudy;
    public int yearOfStudy;
    public String hobbies;

    public Student(String name, int age, String gender, String nameOfInstitution, String programOfStudy,
            int yearOfStudy, String hobbies) {
        super(name, age, gender); // ^ Inherited the constructor from the parent class
        this.nameOfInstitution = nameOfInstitution;
        this.programOfStudy = programOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.hobbies = hobbies;
    }

    public Student(Student s) {
        this(s.name, s.age, s.gender, s.nameOfInstitution, s.programOfStudy, s.yearOfStudy, s.hobbies);
    }

    // & Accessor methods - Getters
    public String getNameOfInstitution() {
        return this.nameOfInstitution;
    }

    public String getProgramOfStudy() {
        return this.programOfStudy;
    }

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public String getHobbies() {
        return this.hobbies;
    }

    // & Mutator Methods - Setters
    public void setNameOfInstitution(String nameOfInstitution) {
        this.nameOfInstitution = nameOfInstitution;
    }

    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
