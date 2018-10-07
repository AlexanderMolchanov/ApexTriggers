package com.company;

public class Matches {

    public static int getNumberOf(int input) {

        int rows = 2, cols = 1, result = 4;

        if (input == 1) {
            return result;
        }

        for (int counter = 1; counter <= input; counter = rows * cols) {

            result += amountPerSquares(Math.min(rows, cols));

            if (rows < cols) {
                rows++;
            } else {
                cols++;
            }
        }

        if (rows > cols) {
            rows--;
        } else {
            cols--;
        }

        result += amountPerSquares(input - rows * cols);

        return result;
    }

    private static int amountPerSquares(int n) {
        if (n >= 1) {
            return (3 + (n - 1) * 2);
        } else {
            return 0;
        }

    }
}
