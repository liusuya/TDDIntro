package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int num) {
        int factorial = 1;
        if (num != 0)
            for (int i = 1; i <= num; i++)
              factorial *= i;

        return factorial;
    }
}
