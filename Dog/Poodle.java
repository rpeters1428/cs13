public class Poodle implements Dog
{
    private String name;
    private int age;
    private int weight;
    private boolean isPoofy;
    
    public Poodle(String n, int a, int w, boolean p)
    {
        name = n;
        age = a;
        weight = w;
        isPoofy = p;
    }
    
    public String bark()
    {
        return "Woof woof!";
    }
    
    public String eat()
    {
        return "Wakka wakka";
    }
    
    public String toString()
    {
        return name + " " + age + " " + weight + " " + isPoofy;
    }
    
    public void shave()
    {
        isPoofy = false;
    }
    
    public int birthday()
    {
        age++;
        return age;
    }
}