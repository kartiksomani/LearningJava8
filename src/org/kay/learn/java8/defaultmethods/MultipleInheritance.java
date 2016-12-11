package org.kay.learn.java8.defaultmethods;

/**
 * Created by kay on 11/12/16.
 * This method implements two interfaces having same default method
 * It overrides a default method to remove ambiguity, and calls one of the
 * default methods from an interface
 */
public class MultipleInheritance implements InterfaceA,InterfaceB{

    /*
     * This method avoids ambiguity between default implementations in InterfaceA
     * and InterfaceB, and calls the method from InterfaceB.
     * If this method is removed, the code will not compile
     */
    @Override
    public void start() {
        InterfaceB.super.start();
    }

    @Override
    public void run() {
        System.out.println("Running MultipleInheritance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MultipleInheritance");
    }
}
