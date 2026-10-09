public class Penguin extends Bird{
    private static String PenG = "";
    public Penguin(String name)
    {
        super(PenG = name);
    }
    public void Slide()
    {
        System.out.println(PenG + " is sliding around");
    }
    public void Swim()
    {
        System.out.println(PenG+ " is swimming");
    }
}
