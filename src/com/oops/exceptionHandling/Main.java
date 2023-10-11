package com.oops.exceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
//            int c = a / b;
//            divide(a, b);
            // mimicking
//            throw new Exception("just for fun");
            String name = "Abhi";
            if (name.equals("Abhi")) {
                throw new MyException("name is Abhi");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) { // The more strict rules should come above
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Normal exception");
        } finally {
            // Maybe sometimes we want to close a file irrespective of getting or not getting exceptions
            System.out.println("This will always execute irrespective of whether a exception is thrown or not");
        }
    }

    // throws keyword means it may throw an exception
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // throw keyword means we are throwing an exception
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}
