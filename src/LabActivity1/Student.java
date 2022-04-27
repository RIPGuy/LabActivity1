package LabActivity1;

public class Student extends Main {

    public String firstName;
    public String lastName;
    public String idNumber;


    public Student(String firstName, String idNumber, String lastName){
        this.firstName=firstName;
        this.idNumber=idNumber;
        this.lastName=lastName;
    }

    public String toString(){
        return ("Student Name: " + this.idNumber + " " + this.lastName + ", " + this.firstName);
    }
}
