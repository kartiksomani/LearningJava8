package org.kay.learn.java8.functionalinterface;

/**
 * Created by kay on 17/12/16.
 */
public class EmployeePredicate {
    public static boolean isPermanent(Employee employee) {
        if (EmployeeType.REGULAR == employee.getEmployeeType()) {
            return true;
        }
        return false;
    }
}
