package org.example;

public class WinnerState extends State {
    private final GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }
    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("You're winner! You get two gumballs for your quarter");
        System.out.println("Yor get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if( gumballMachine.getCount() == 0 ){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if( gumballMachine.getCount() > 0 ){
                gumballMachine.setState(gumballMachine.noQuarterState);
            }else{
                System.out.println("Oops! You have no gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

}
