package Interface;

public abstract class Animal1 {
    protected String animalName;

    public Animal1(String animalName) {
        this.animalName = animalName;
    }

    public void sleep() {
        System.out.println(animalName + " is sleeping.");
    }

    public abstract void makeSound();
}
