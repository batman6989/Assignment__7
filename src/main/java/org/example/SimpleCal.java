package org.example;


import static java.lang.System.out;

public class SimpleCal{
    double result;
    public double doMultiplication(double i, double i1) {
        result = i * i1;
        out.println("Multiplication of " + i + " and " + i1 + " is ::::::: " + result);
        return result;

    }

    public static void main(String[] args) {
        out.println("******* Entering in Multiplication Process ********");
        new SimpleCal().doMultiplication(5,2);
        new SimpleCal().doMultiplication(2,3);
        new SimpleCal().doMultiplication(8,6);
        new SimpleCal().doMultiplication(9,9);




    }
}