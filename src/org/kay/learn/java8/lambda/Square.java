package org.kay.learn.java8.lambda;

/**
 * Created by kay on 11/12/16.
 * Represents a square
 */
public class Square {
    private int length;
    private int breadth;

    public Square(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}
