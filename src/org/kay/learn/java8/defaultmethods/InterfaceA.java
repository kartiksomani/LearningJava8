package org.kay.learn.java8.defaultmethods;

/**
 * Created by kay on 11/12/16.
 * This interface defines one default method to be tried
 */
public interface InterfaceA {
    default void start() {
        System.out.println("This is the default implementation of start from InterfaceA");
    }

    void run();
    void stop();
}
