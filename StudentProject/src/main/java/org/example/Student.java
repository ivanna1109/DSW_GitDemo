package org.example;

public class Student {
    String firstName;
    String lastName;
    String address;

    public Student() {
        this.firstName = "Ivana";
        this.lastName = "Milutinovic";
        this.address = "Knez Mihailova 6";
    }

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getAddress() { return address;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student: "+lastName+" "+firstName;
    }
}
