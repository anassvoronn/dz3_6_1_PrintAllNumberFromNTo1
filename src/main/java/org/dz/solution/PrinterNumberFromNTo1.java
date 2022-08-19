package org.dz.solution;

public class PrinterNumberFromNTo1 {
    public void print(final int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Wrong number = " + number);
        }
        for (int i = number; i >= 1; i--) {
            if (i % 5 == 0) {
                System.out.println(i);

            }
        }

    }
}
