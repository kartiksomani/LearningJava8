package org.kay.learn.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * This class is for trying streams
 * Created by kay on 18/12/16.
 */
public class StreamsMain {

    public static void main(String args[]) {
        Collection<Integer> numbers = getNumbersCollection();

        System.out.println("Filter:");
        //Trying filter
        numbers.stream()
                .filter(StreamsMain::evenNumber)
                .forEach(System.out::println);

        //Sorted
        System.out.println("Sorted:");
        Predicate<Integer> evenNumber = StreamsMain::evenNumber;
        numbers.stream()
                .sorted()
                .filter(evenNumber.negate())
                .forEach(System.out::println);


        //Map
        System.out.println("Map:");
        numbers.stream()
                .filter(evenNumber)
                .map((num)-> num * 5)
                .forEach(System.out::println);

        //Match
        System.out.println("Match:");
        boolean evenFound = numbers.stream().filter(evenNumber)
                .allMatch(evenNumber);
        boolean oddFound = numbers.stream().filter(evenNumber)
                .allMatch(evenNumber.negate());
        System.out.println("Event found :" + evenFound + "\t odd Found : " + oddFound);

        //Reduce
        System.out.println("Reduce:");
        Optional<Integer> result = numbers.stream().filter(evenNumber.negate())
                .reduce((num1,num2)->num1 + num2);
        result.ifPresent(System.out::println);

    }

    public static boolean evenNumber(int num) {
        return num % 2 == 0;
    }

    public static Collection<Integer> getNumbersCollection() {
        List<Integer> numbers = Arrays.asList(8,2,6,3,1,4,5,7);
        return numbers;
    }
}
