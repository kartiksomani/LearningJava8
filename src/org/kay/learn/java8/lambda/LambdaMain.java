package org.kay.learn.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kay on 11/12/16.
 */
public class LambdaMain {
    public static void main(String args[]) {
    List<Square> squares = new ArrayList<>();
    squares.add(new Square(4,2));
    squares.add(new Square(2,3));
    squares.add(new Square(3,3));
    System.out.println("Before sorting: ");
    printSquareList(squares);
    Collections.sort(squares,(a,b)->(a.getArea() - b.getArea()));
    System.out.println("After Sorting: " + squares);
    printSquareList(squares);
    }

    /**
     * Helper method to print areas of a list of squares
     * @param squares
     */
    public static void printSquareList(List<Square> squares) {
        for (Square square:squares) {
            System.out.println(square.getArea());
        }
    }
}


