import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int re = 0;
        System.out.print("Input one integer: ");
        int in1 = reader.nextInt();
        System.out.print("Input another integer: ");
        int in2 = reader.nextInt();

        System.out.println("");

        if (in2 > in1){
            re = in2;
            in2 = in1;
            in1 = re;
        }
        while (in2 != 0){
            re = in1 % in2;
            System.out.println("Remainder: "+re);
            in1 = in2;
            System.out.println("Larger integer is now: "+in1 );
            in2 = re;
            System.out.println("Smaller integer is now: "+in2+"\n" );
        }
    }
}
