package Assignments.InterfaceOct17.Problem1.Classes;

import Assignments.InterfaceOct17.Problem1.Interfaces.Animal;
import Assignments.InterfaceOct17.Problem1.Interfaces.Swimmable;

public class Penguin implements Animal, Swimmable {
    @Override
    public void feed() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin chrips");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
