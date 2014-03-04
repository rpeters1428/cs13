/**
 * Interface for List
 *
 * @author  Ryan Peters
 * @version 3/3/2014
 */

public interface List<X>
{
    public void add(X value);
    
    public void remove();
    
    public String toString();
    
    public void set(int index, X value);
    
    public X get(int index);
    
    public int size();
    
    public void clear();
    
    public void insert(int index, X value);
    
    public void delete(int index);
    
    public int indexOf(X value);
    
    public boolean contains(X value);
   
}