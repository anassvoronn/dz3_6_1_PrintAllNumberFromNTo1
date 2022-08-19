package org.dz.solution;

public class PrinterNumberFromNTo1 {
    public void print(final int number) {
        if (number <= 2) {
            throw new IllegalArgumentException("Wrong number = " + number);
        }
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        for (int i = number; i >= length; i--) {
            if (i % 5 == 0) {
                System.out.println(i);

            }
        }

    }
}
