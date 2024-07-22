package org.example;

public abstract class State {

    public void insertQuarter(){};
    public void ejectQuarter(){};
    public void turnCrank(){};
    public void dispense(){};
    public void choose(String flavor){};

}
