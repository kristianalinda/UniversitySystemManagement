package oop;

public class Women implements HumanActions {

    @Override
    public void walk() {
        System.out.println("MOVE, BITCH");
    }

    @Override
    public void talk() {
        System.out.println("Hi!");

    }

    @Override
    public void sit() {
        System.out.println("Yes");

    }

    @Override
    public void work() {
        System.out.println("Don't disturb");

    }
}
