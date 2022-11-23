package Interface;

import AbstractClass.Animal;

public class Pig extends Animal implements Edible {
    public Pig() {
        super("Pig");
    }

    @Override
    public void makeSound() {
        System.out.println("Oink!");
    }

    public String youMayEat() {
        System.out.println("You may eat pork chops.");
    }
}
