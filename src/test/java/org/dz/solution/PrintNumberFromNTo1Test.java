package org.dz.solution;

import org.junit.Test;


public class PrintNumberFromNTo1Test {

    @Test
    public void print100() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print2() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(2);
    }

    @Test
    public void print50() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(50);
    }

    @Test
    public void print5() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(5);
    }

    @Test
    public void print537() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(537);
    }

    @Test
    public void print83() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(83);
    }

    @Test
    public void print645() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(645);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printMinus17() {
        PrinterNumberFromNTo1 printer = new PrinterNumberFromNTo1();
        printer.print(-17);
    }
}