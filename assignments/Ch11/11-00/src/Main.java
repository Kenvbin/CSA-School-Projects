// Write a class with 2 methods 1 subclass with 2 overriding methods
//super to use overridden method

public class Main {
    public static void main(String[] args) throws Exception {
        Bird gerald = new Bird("gerald");
        Penguin herbert = new Penguin("herbert");

        gerald.Fly();
        gerald.Speak();

        System.out.println("");

        herbert.Fly();
        herbert.Speak();
    }
}
