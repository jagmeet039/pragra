package Assignments.InterfaceOct17.Problem1.Classes;

import Assignments.InterfaceOct17.Problem1.Interfaces.Animal;
import Assignments.InterfaceOct17.Problem1.Interfaces.Climbable;

public class Monkey implements Animal, Climbable {
    @Override
    public void feed() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey shouts");
    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing tree");
    }
}
