package Assignments.InterfaceOct17.Problem1;

import Assignments.InterfaceOct17.Problem1.Classes.Lion;
import Assignments.InterfaceOct17.Problem1.Classes.Monkey;
import Assignments.InterfaceOct17.Problem1.Classes.Penguin;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Monkey monkey = new Monkey();

        lion.feed();
        lion.makeSound();

        penguin.feed();
        penguin.makeSound();
        penguin.swim();

        monkey.feed();
        monkey.makeSound();
        monkey.climb();

    }
}
