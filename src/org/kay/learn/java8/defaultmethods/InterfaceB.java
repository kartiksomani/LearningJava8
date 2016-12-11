package org.kay.learn.java8.defaultmethods;

/**
 * Created by kay on 11/12/16.
 * This is the second interface, and has the same default method as InterfaceA
 */
public interface InterfaceB {
    default void start()  {
        System.out.println("Default start method from InterfaceB");
    }
}
