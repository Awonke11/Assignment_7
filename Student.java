import java.util.ArrayList;

/*
 * A program thats creates a Student Object 
 * Author: Awonke Mnotoza
 * Date: 21 September 2022
 * Student number: MNTAWO002
 */
public class Student extends Person {
    // & Initialized the variables
    public String institution;
    public String programmeOfStudy;
    public int yearOfStudy;
    // ^ Store the array of hobbie(s)
    public ArrayList<String> hobbies;

    Student(String personName, int personAge, String personGender, String institution, String programmeOfStudy,
            int yearOfStudy, String[] hobbies) {
        super(personName, personAge, personGender); // ^ Inherited the constructor from the parent class
        this.institution = institution;
        this.programmeOfStudy = programmeOfStudy;
        this.yearOfStudy = yearOfStudy;
        for (int i = 0; i < hobbies.length; i++) {
            this.hobbies.add(hobbies[i]);
        }
    }

    // & Accessor methods - Getters
    public String getInstitution() {
        return this.institution;
    }

    public String getProgrammeOfStudy() {
        return this.programmeOfStudy;
    }

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public String[] getHobbies() {
        String[] extractHobbies = new String[this.hobbies.size()];
        for (int i = 0; i < hobbies.size(); i++) {
            extractHobbies[i] = (hobbies.get(i));
        }
        return extractHobbies;
    }

    // & Mutator Methods - Setters
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setProgrammeOfStudy(String programmeOfStudy) {
        this.programmeOfStudy = programmeOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setHobbies(String hobbie) {
        hobbies.add(hobbie);
    }
}
