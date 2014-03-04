/*
 * File Name: Node.java
 * Name:      Ryan Peters
 * Date:      2/19/2014
 * 
 */

public class Node<T>
{
    private T value;
    Node<T> next, previous;
    private Node<T> link;
    
    public T getValue()
    {
        return value;
    }
    
    public void setValue(T v)
    {
        value = v;
    }
    
    public void setLink(Node<T> l)
    {
        link = l;
    }
    
    public Node<T> getLink()
    {
        return link;
    }    
}