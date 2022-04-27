package LabActivity1;
public class Teacher extends Main {

        public String idNumber;
        public String lastName;
        public String firstName;

        public Teacher(String firstName, String idNumber, String lastName){
            this.idNumber=idNumber;
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public String toString(){
            return ("Teacher Name: " + this.idNumber+" "+this.lastName+", "+this.firstName);
        }

    }
