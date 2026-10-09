//11-0000: Interface with 2 methods. 4 objects (2 polymorphisms)
public class App {
    public static void main(String[] args) throws Exception {
        vehicle Jolp = new plane();
        vehicle Holp = new car();

        plane pilot = new plane();
        car driver = new car();

        Jolp.move();
        Jolp.park();
        System.out.println("");

        Holp.move();
        Holp.park();
        System.out.println("");

        pilot.move();
        pilot.park();
        pilot.land();
        System.out.println("");

        driver.move();
        driver.park();
        driver.honk();
    }
}
