public class Kennel
{
    BetterArray dogs;
    
    public Kennel()
    {
        dogs = new BetterArray();
    }
    
    public void addDog(Dog d)
    {
        dogs.add(d);
    }
    
    
    public void inventory()
    {
        for (int i = 0; i < dogs.size(); i++)
        
        {
            System.out.println(dogs.get(i));
        }
        
    }
}