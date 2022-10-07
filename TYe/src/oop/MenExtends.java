package oop;

public class Men implements HumanActions{
    @Override
    public void walk() {
        System.out.println("I can't feel my bum");

    }

    @Override
    public void talk() {
        System.out.println("I am quiet");

    }

    @Override
    public void sit() {
        System.out.println("Yes");

    }

    @Override
    public void work() {
        System.out.println("Time is money");

    }
}
