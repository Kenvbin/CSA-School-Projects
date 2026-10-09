//make a class & subclass with animals
//2 methods in both
//the method does what it says
//main calls all methods

public class Main {
    public static void main(String[] args) throws Exception {
        Bird gerald = new Bird("gerald");
        Penguin herbert = new Penguin("herbert");

        gerald.Hop();
        gerald.layEggs();

        System.out.println("");

        herbert.Hop();
        herbert.layEggs();
        herbert.Slide();
        herbert.Swim();
    }
}
