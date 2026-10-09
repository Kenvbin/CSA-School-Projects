import java.util.Scanner;

public class Sphere {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double radius,diameter,circumfrence,surfacearea,volume;

        System.out.print("Input the Radius of the sphere: ");
        radius = reader.nextInt();

        diameter = radius*2;
        circumfrence = 2 * (Math.PI * radius);
        surfacearea = 4 * (Math.PI * (radius * radius));

        volume = Math.PI * (Math.pow(radius, 3)) * 1.33333333333;
        System.out.print("The diameter of the sphere is: \""+ diameter+"\" \nThe circumfrence of the sphere is: \""+ circumfrence+"\" \nThe surface area of the sphere is: \""+ surfacearea+"\" \nThe volume of the sphere is: \""+ volume+"\"");
    }
}
