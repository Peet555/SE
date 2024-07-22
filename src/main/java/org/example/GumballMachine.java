package org.example;

public class GumballMachine {
    State currentState ;
    State noQuarterState ;
    State soldstate ;
    State soldoutstate ;
    State hasquarterstate ;
    State winnerState ;
    int gumballCount;
    String gumballFlavor;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        soldstate = new SoldState(this);
        soldoutstate = new SoldOutState(this);
        hasquarterstate = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        this.gumballCount = count;
        if (count > 0) {
            currentState = noQuarterState;
        }else{
            currentState = soldoutstate;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();;
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();;
    }

    public void turnCrank() { 
        currentState.turnCrank();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void setState(State state ) {
        this.currentState = state;
    }

    public void setGumballFlavor(String gumballFlavor) {
        this.gumballFlavor = gumballFlavor;
    }

    public State getHasQuarterState(){
        return hasquarterstate;
    }

    public String getGumballFlavor() {
        return gumballFlavor;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldstate;
    }

    public State getSoldOutState() {
        return soldoutstate;
    }

    public State getHasquarterstate() {
        return hasquarterstate;
    }
    public int getCount() {
        return gumballCount;
    }

    public void releaseBall(){
        gumballCount--;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void choose(String flavor) {
        currentState.choose(flavor);
    }
}