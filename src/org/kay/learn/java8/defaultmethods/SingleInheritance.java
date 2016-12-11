package org.kay.learn.java8.defaultmethods;

/**
 * Created by kay on 11/12/16.
 * This class implements one interface with a default method
 * It doesn't implement the default method start
 */
public class SingleInheritance implements InterfaceA{

    @Override
    public void run() {
        System.out.println("Running from SingleInheritance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping from SingleInheritance");
    }
}
