import java.util.Scanner;

public class Momentumer {
    public static void main(String[] args) throws Exception {
        try (Scanner converter = new Scanner(System.in)) {
            int mass;
            int velocity;
            int momentum;
            System.out.print("What is the object's mass? (In kilograms): ");
            mass = converter.nextInt();
            System.out.print("What is the object's velocity? (In meters per second): ");
            velocity = converter.nextInt();
            momentum = velocity * mass;
            System.out.print("The momentum for an object that has a mass of ");
            System.out.print(mass);
            System.out.print("kg and a velocity of ");
            System.out.print(velocity);
            System.out.print(" m/s is: ");
            System.out.print(momentum);
            System.out.print(" kg*m/s");
        }
    }
}
