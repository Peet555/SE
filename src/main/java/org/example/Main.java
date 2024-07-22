package org.example;
/*
    6510450429 Thanatus Suwan
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}