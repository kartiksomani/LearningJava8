package org.kay.learn.java8.functionalinterface;

/**
 * This interface is used to demonstrate the use of constructor reference
 * Created by kay on 11/12/16.
 */
@FunctionalInterface
public interface TrialConstRefInterface<E extends Employee> {
    E create(String firstName, String lastName);
}
