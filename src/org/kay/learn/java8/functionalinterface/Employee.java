package org.kay.learn.java8.functionalinterface;

/**
 * Created by kay on 11/12/16.
 */
public class Employee {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printEmployeeName() {
        System.out.println(firstName + " " + lastName);
    }
}
