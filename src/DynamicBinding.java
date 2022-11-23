class A{
    public void hello(){
        System.out.println("this message is from class A.");
    }
}
class B extends A{
    public void hello(){
        System.out.println("This message is from B.");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        A obj1 = new B();
        A obj2 = new A();

        obj1.hello();
        obj2.hello();
    }

}
