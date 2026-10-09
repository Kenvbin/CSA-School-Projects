import java.util.Scanner;

public class kineticenergy {
    public static void main(String[] args) throws Exception {
        try (Scanner converter = new Scanner(System.in)) {
            double mass;
            double velocity;
            double momentum;
            double kineticenergy;

            System.out.print("What is the object's mass? (In kilograms): ");
            mass = converter.nextInt();

            System.out.print("What is the object's velocity? (In meters per second): ");
            velocity = converter.nextInt();
            momentum = velocity * mass;

            kineticenergy = (mass * Math.pow(velocity, 2))/2;
            System.out.print("The momentum for an object that has a mass of " + mass + "kg and a velocity of "+ velocity + " m/s is: " + momentum + " kg*m/s The kinetic energy of the object is "+ kineticenergy + " J");

        }
    }
}
