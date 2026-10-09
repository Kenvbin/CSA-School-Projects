import java.util.Scanner;

public class CubeSurfaceArea {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int edge;
        int surfacearea;

        System.out.print("Input the length of an edge in order to calculate the cubes surface area (input an int): ");
        edge = reader.nextInt();

        surfacearea = 6* (edge* edge);

        System.out.print("The surface area of the cube is: " + surfacearea);
    }
}
