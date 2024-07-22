package org.example;

public class SoldOutState extends State{
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Nothing happen!");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("Nothing happen!");
    }
    @Override
    public void turnCrank() {
        System.out.println("Nothing happen!");
    }
    @Override
    public void dispense() {
        System.out.println("Nothing happen!");
    }

}