package me.lavinoys.java8to11;

public class Foo {

    public static void main(String[] args) {
        int baseNumber = 10;

        RunSomething runSomething = number -> number + baseNumber;

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(2));
    }
}
