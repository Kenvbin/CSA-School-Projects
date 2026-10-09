public class person {
    private int age;
    private double weight;
    
    public person(){
        weight = 0;
        age = 0;
    }
    
    public person(double weight, int age)
    {
        this.weight = weight;
        this.age = age;
    }

    public String toString()
    {
        String string;
        string = "Weight: "+ weight + "\nAge: " + age;
        return string;
    }
}
