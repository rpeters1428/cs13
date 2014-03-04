public class Pug implements Dog
{
    private String name;
    private int age;
    private String color;
    private boolean isAsleep;
    
    public Pug(String n, int a, String c, boolean s)
    {
        name = n;
        age = a;
        color = c;
        isAsleep = s;
    }
    
    public String eat()
    {
        return "Nom nom nom!";
    }
    
    public void sleep()
    {
        isAsleep = true;
    }
    
    public String bark()
    {
        return "Bark bark!";
    }
    
    public String toString()
    {
        return name + " " + age + " " + color + " " + isAsleep;
    }
    
    public int birthday()
    {
        age++;
        return age;
    }
}