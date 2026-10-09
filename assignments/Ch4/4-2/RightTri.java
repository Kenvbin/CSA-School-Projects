import java.util.Scanner;
public class RightTri {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        
        System.out.print("Enter one of the lengths from the triangle: ");
        side1 = reader.nextDouble();
        
        System.out.print("Enter another length from the triangle: ");
        side2 = reader.nextDouble();
        
        System.out.print("Enter the last length from the triangle: ");
        side3 = reader.nextDouble();
        
        if (side1*side1 + side2*side2 == side3*side3 || side2 *side2 +side3*side3 ==side1*side1 || side1*side1 + side3*side3 == side2*side2)
            System.out.print("The triangle is a right triangle.");
        else
            System.out.print("The triangle isnt a right triangle."); 
    }
}
