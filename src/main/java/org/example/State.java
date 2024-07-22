package org.example;
/*
    6510450429 Thanatus Suwan
 */
public abstract class State {

    public void insertQuarter(){};
    public void ejectQuarter(){};
    public void turnCrank(){};
    public void dispense(){};
    public void choose(String flavor){};

}
