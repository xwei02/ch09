package Interface;

public class Pig extends Animal1 implements Edible {
    public Pig() {
        super("Pig");
    }

    @Override
    public void makeSound() {
        System.out.println("Oink!");
    }

    public String youMayEat() {
        return "You may eat pork chops.";
    }
}