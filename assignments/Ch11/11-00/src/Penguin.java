public class Penguin extends Bird{
    private static String PenG = "";

    public Penguin(String name)
    {
        super(PenG = name);
    }

    public void Fly()
    {
        System.out.println(PenG + " is sad that penguins cant fly");
    }
    public void Speak()
    {
        System.out.println(PenG+ " is honking");
    }
}
