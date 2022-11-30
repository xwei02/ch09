package Interface;

import AbstractClass.Animal;
import AbstractClass.Cat;
import AbstractClass.Dog;

public class Main2 {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();

        dog1.makeSound();
        cat1.makeSound();
        dog2.makeSound();
        cat2.sleep();

    }

}