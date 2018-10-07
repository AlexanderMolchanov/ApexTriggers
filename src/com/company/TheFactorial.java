package com.company;

import java.math.BigInteger;

public class TheFactorial {

    public static int getFactorialBase(BigInteger input) {

        BigInteger divide = BigInteger.ONE;

        do {

            input = input.divide(divide);
            divide = divide.add(BigInteger.ONE);

            if ((input.compareTo(divide) == -1) && (!input.equals(BigInteger.ONE))) {
                System.err.println("Number is not factorial. The closest factorial of number: " + divide.intValue() + "!");
                return 0;
            }

        } while (!input.equals(BigInteger.ONE) && (input.compareTo(divide) == 1));

        return divide.intValue();
    }

}
