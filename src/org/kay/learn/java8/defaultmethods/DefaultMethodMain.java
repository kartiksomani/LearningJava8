package org.kay.learn.java8.defaultmethods;

/**
 * Created by kay on 11/12/16.
 */
public class DefaultMethodMain {
    public static void main(String args[]) {
        SingleInheritance singleInheritance = new SingleInheritance();
        singleInheritance.start();
        singleInheritance.run();
        singleInheritance.stop();

        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.start();
        multipleInheritance.run();
        multipleInheritance.stop();
    }
}
