package AbstractClass;

public class Cat extends Animal {
    public Cat(){
        super("Cat");
    }
    @Override
    public void makeSound(){
        System.out.println("Meow~~");
    }
}
