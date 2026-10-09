//11-000: 3 objects, one parent, one child, one polymorphism. Have methods and override methods
public class App {
    public static void main(String[] args) throws Exception {
        parent Ronald = new parent();
        child Billy = new child();
        parent Macdonald = new child();

        Ronald.live();
        Ronald.live(28);
        Billy.live();
        Billy.live(5);
        Macdonald.live();
        Macdonald.live(6);
    }
}
