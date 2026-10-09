public class Bird {
    public String Beard = "";

    public Bird(String name)
    {
        Beard = name;
    }
    public void Fly()
    {
        System.out.println(Beard+" is flying away");
    }
    public void Speak()
    {
        System.out.println(Beard+" is chirping");
    }
}
