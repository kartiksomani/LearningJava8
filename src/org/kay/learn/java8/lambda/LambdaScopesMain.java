package org.kay.learn.java8.lambda;

/**
 * Created by kay on 11/12/16.
 */
public class LambdaScopesMain {
    private static int tryAndChangeMe = 1;
    public static void runExample(int funcArg) {
        int localVar = 20;
        Runnable runnable = ()->{
            System.out.println("Running with argument of the enclosing function");
            for (int i = 0; i < funcArg; ++i) {
                System.out.println(i);
            }

            System.out.println("Running with local variable");
            //Not allowed, should be effectively final
            //localVar = 30;

            //fields and static variables are allowed to be modified
            tryAndChangeMe = 100;

            for (int i = 0; i < localVar; ++i) {
                System.out.println(i);
            }
        };
        new Thread(runnable).start();
    }
    public static void main(String args[]) {
       runExample(10);
    }
}
