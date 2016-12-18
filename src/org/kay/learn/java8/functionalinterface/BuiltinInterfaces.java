package org.kay.learn.java8.functionalinterface;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.kay.learn.java8.functionalinterface.EmployeePredicate.isPermanent;
/**
 * Created by kay on 17/12/16.
 */


public class BuiltinInterfaces {
    public static Employee createTempEmployee() {
        Employee employee = new Employee("Kartik","Somani");
        return employee;
    }

    public static void main(String args[]) {
        Employee employee = new Employee("Kartik","Somani");

        //Predicate usage
        employee.setEmployeeType(EmployeeType.REGULAR);
        Predicate<Employee> employeePredicate = EmployeePredicate::isPermanent;
        if (employeePredicate.test(employee)) {
            System.out.println("Employee is Permanent");
        } else {
            System.out.println("Employee is temporary");
        }

        //Function
        Function<Integer, Double> squareRoot = IntegerSquareRootFunction::squareRoot;
        Function<Double, String> square = IntegerSquareRootFunction::getStringResult;
        Function<Integer,String> squareCombo = squareRoot.andThen(square);
        System.out.println(squareCombo.apply(90));

        //Supplier
        Supplier<Employee> tempEmployeeSupplier = BuiltinInterfaces::createTempEmployee;
        Employee tempEmployee = tempEmployeeSupplier.get();
        tempEmployee.printEmployeeName();

        //Consumer
        Consumer<Employee> employeeBioPrinter = Employee::printEmployeeBio;;
        employeeBioPrinter.accept(tempEmployee);

        //Comparator
        Comparator<Employee> employeeNameSizeComparator = (e1,e2)->{return (e1.getFirstName().length() - e2.getFirstName().length());};
        Employee joe = new Employee("Joe","Somani");
        System.out.println("Forward comparison: " + employeeNameSizeComparator.compare(tempEmployee,joe));
        System.out.println("Reverse comparison: " + employeeNameSizeComparator.reversed().compare(tempEmployee,joe));

        //Optional
        Optional<Employee> optionalTemp = Optional.of(tempEmployee);
        Employee nullableEmployee = null;
        Optional<Employee> optionalNullableEmployee = Optional.ofNullable(nullableEmployee);
        //Throws Null pointer exception
        //employeeBioPrinter.accept(nullableEmployee);;
        System.out.println("------");
        optionalNullableEmployee.ifPresent(employeeBioPrinter);
        System.out.println("------");
        Employee retrievedEmployee = optionalNullableEmployee.orElseGet(tempEmployeeSupplier);
        employeeBioPrinter.accept(retrievedEmployee);
    }
}
