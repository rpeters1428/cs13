/*
 * File Name: LList.java
 * Name:      Ryan Peters
 * Date:      2/19/2014
 * 
 */
public class LList
{
    private Node head;
    private Node tail;
    private Node next;
    private int size = 0;
    
    // Add to the head of the linked list (string)
    public void add(String v)
    {
        Node b = new Node();
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
    
    public String get(int index)
    {
        if(index < 0 || index > size)
        {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        else
        {
            Node a = head;
            int c = 0;
            for (int i = 0; i < index-1; i++)
            {
                a = a.getLink();
                c++;
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
    
    // Returning the value(s) (int) of the linked list
    public String toString()
    {
        Node i = head;
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
    
    public void insert(String v, int index)
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
            Node current = head;
            for (int i = 0; i < index-1; i++)
            {
                current = current.getLink();
            }
            
            Node newNode = new Node();
            newNode.setValue(v);
            newNode.setLink(current.getLink());
            current.setLink(newNode);
        }
        size++;
    }
    
    public void delete(int index)
    {
        if (index < 0 || index > size)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        {
            Node current = head;
            if (index == 0)
            {
                head = head.getLink();
            }
            else
            {
                for (int i = 0; i < index - 1; i++)
                {
                    current = current.getLink();
                }
                current.setLink(current.getLink());
            }
            size--;
        }
    }
    
    public int indexOf(String v)
    {
        Node n = head;
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
    
    public boolean contains(String v)
    {
        Node n = head;
        int c = 0;
        if (n.getValue() == v)
        {
            return true;
        }
        for (int i = 0; i < size - 1; i++)
        {
            n = n.getLink();
            c++;
            if(n.getValue() == v)
            {
                return true;
            }
        }
        return false;
    }
}