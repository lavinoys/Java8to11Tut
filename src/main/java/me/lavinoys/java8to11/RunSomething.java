package me.lavinoys.java8to11;

@FunctionalInterface
public interface RunSomething {

    int doIt(int number); // 추상 메서드가 몇개냐?

    /*static void printName() {
        System.out.println("Keesun");
    }

    default void printAge() {
        System.out.println("40");
    }*/
}
