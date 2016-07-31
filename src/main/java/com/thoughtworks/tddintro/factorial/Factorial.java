package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int num) {

        if  (num == -1)
            throw new IllegalArgumentException();

        int factorial = 1;
        if (num != 0)
            for (int i = 1; i <= num; i++)
              factorial *= i;

        return factorial;
    }
}
