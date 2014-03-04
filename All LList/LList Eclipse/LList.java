/*
 * File Name: LList.java
 * Name:      Ryan Peters
 * Date:      2/19/2014
 * 
 */
public class LList<T>
{
	// Static variables 
    private Node<T> head;
    private int size;
    
    // Constructor sets a new Node at value null
    public LList()
    {
        Node<T> a = new Node<T>();
        a.setValue(null);
        size = 0;
    }
    
    // Add to the head of the linked list (string)
    public void add(T v)
    {
        Node<T> b = new Node<T>();
        b.setValue(v);
        b.setLink(head);
        head = b;
        size++;
    }
    
    // Return the size of the linked list using a counter
    public int size()
    {
        return size;
    }
    
    // Get the "Value" from the index given
    // Throw exception when index is neg. or over size
    public T get(int index)
    {
        if(index < 0 || index > size - 1)
        {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        else
        {
            Node<T> a = head;
            for (int i = 0; i < index; i++)
            {
                a = a.getLink();
            }
            return a.getValue();
        }
    }
    
    // Clearing out the linked list to null
    public void clear()
    {
        head = null;
        size = 0;
    }
    
    // toString gives "guts" of the linked list
    public String toString()
    {
        Node<T> i = head;
        String s = "";
        int l = 0;
        
        while (i != null)
        {
            s += " " + l + ":" + i.getValue();
            i = i.getLink();
            l++;
        }
        return s;
    }
    
    // Remove from the beginning of the linked list
    // Throw exception if the head != null
    public void remove()
    {
        if (head != null)
        {
            head = head.getLink();
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        size--;
    }
    
    // Insert "value" at given index
    // Throw exception when index is < 0 || over size
    public void insert(T v, int index)
    {
        if (index < 0 || index > size)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        
        if (index == 0)
        {
            add(v);
        }
        else
        {
            // Hop down index-1 Nodes
            Node<T> current = head;
            for (int i = 0; i < index-1; i++)
            {
                current = current.getLink();
            }
            
            Node<T> newNode = new Node<T>();
            newNode.setValue(v);
            newNode.setLink(current.getLink());
            current.setLink(newNode);
        }
        size++;
    }
    
    // Delete "value" at given index
    // throw exception if index is invalid
    public void delete(int index)
    {
        if (index < 0 || index > size)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        {
        	// If it's at the head of the linked list
            Node<T> current = head;
            if (index == 0)
            {
                remove();
            }
            else if (index == size) // If at end of list
            {
                for (int i = 0; i < index - 1; i++)
                {
                    current = current.getLink();
                }
                
                current = null;
                size--;
            }
            else
            {
            	// If in the middle of the list
                for (int i = 0; i < index - 1; i++)
                {
                    current = current.getLink();
                }
                current.setLink(current.getLink().getLink());
                size--;
            }
        }
    }
    
    // Find the index of the given "value"
    // If not in the list return -1
    public int indexOf(T v)
    {
        Node<T> n = head;
        int c = 0;
        if (n.getValue() == v)
        {
            return c;
        }
        for (int i = 0; i < size - 1; i++)
        {
            n = n.getLink();
            c++;
            if(n.getValue() == v)
            {
                return c;
            }
        }
        return -1;
    }
    
    // See if list contains the given "Value"
    // If it's not in the list return false
    public boolean contains(T v)
    {
        Node<T> n = head;
        if (n.getValue() == v)
        {
            return true;
        }
        for (int i = 0; i < size - 1; i++)
        {
            n = n.getLink();
            if(n.getValue() == v)
            {
                return true;
            }
        }
        return false;
    }
}