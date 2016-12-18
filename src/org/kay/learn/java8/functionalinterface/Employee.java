package org.kay.learn.java8.functionalinterface;

/**
 * Created by kay on 11/12/16.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private EmployeeType employeeType;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = EmployeeType.REGULAR;
    }

    public void printEmployeeName() {
        System.out.println(firstName + " " + lastName);
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public static void printEmployeeBio(Employee employee) {
        System.out.println("First Name : " + employee.firstName);
        System.out.println("Last Name : " + employee.lastName);
        System.out.println("Type : " + employee.employeeType.name());
    }

    public String getFirstName() {
        return firstName;
    }
}
