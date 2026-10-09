import java.util.Scanner;
public class DayCulator {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Converter conv = new Converter();
        int Decide = 0;
        while (Decide != 3){
            System.out.println("1) Hours to Days \n2) Days to Hours \n3) Quit");
            try{
                System.out.print(": ");
                Decide = reader.nextInt();
            }
            catch(Exception e){
                System.out.println("\nInvalid input.\n");
                reader.nextLine();
            }
            try{
                if (Decide == 1){
                    System.out.print("\nPut the amount of hours you would like to convert: ");
                    int hours = reader.nextInt();
                    System.out.println("Days: "+conv.HTD(hours)+ " Hours: "+conv.RemainderHours(hours, conv.HTD(hours)));
                }
                else if(Decide ==2){
                    System.out.print("\nPut the amount of days you would like to convert: ");
                    int days = reader.nextInt();
                    System.out.println("Hours: "+conv.DTH(days));
                }
            }
            catch(Exception e){
                System.out.println("\nInvalid input.\n");
                reader.nextLine();
            }
        }
    }
}
