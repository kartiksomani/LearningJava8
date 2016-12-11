package org.kay.learn.java8.functionalinterface;

/**
 * Created by kay on 11/12/16.
 */
public class FuncInterfaceMain {
    /*
     * This method adheres to the specification of square in TrialFuncInterface
     * So it can be used to assign to a TrialFuncInterface reference
     */
    public static int square(int num) {
        return num * num;
    }

    public static int power(int num, int exponent) {
        int result = num;
        for (int i = 1; i < exponent; ++i) {
            result *= result;
        }
        return result;
    }


    public static void main(String args[]) {
        //Using method reference
        TrialFuncInterface func = FuncInterfaceMain::square;
        // Doesn't work, incompatible
        //TrialFuncInterface func2 = FuncInterfaceMain::power;

        System.out.println("Square of 5 is " + func.square(5));

        //Another way, using lambda
        TrialFuncInterface anotherFunc = (num)->FuncInterfaceMain.square(num);
        System.out.println("Square of 5 using lambda is " + anotherFunc.square(5));

        //Demonstrating constructor reference
        TrialConstRefInterface<Employee> constRefInterface = Employee::new;
        Employee emp = constRefInterface.create("Kartik","Somani");
        System.out.println("Created object:");
        emp.printEmployeeName();
    }
}
