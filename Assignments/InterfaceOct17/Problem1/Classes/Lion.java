package Assignments.InterfaceOct17.Problem1.Classes;

import Assignments.InterfaceOct17.Problem1.Interfaces.Animal;

public class Lion implements Animal {

    @Override
    public void feed() {
        System.out.println("Lion is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars");
    }

}
