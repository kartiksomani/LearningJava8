package org.kay.learn.java8.functionalinterface;

/**
 * This will be used as a functional interface
 * Created by kay on 11/12/16.
 */
@FunctionalInterface
public interface TrialFuncInterface {
    int square(int num);
    //Cannot add this abstract method because of @FunctionalInterface annotation
    //int power(int num,int exponent);

    /**
     * This method can be allowed since it is a default method.
     * @param num
     * @return
     */
    default int increment(int num) {
        return num + 1;
    }

}
