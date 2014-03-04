/*
 * File Name: Node.java
 * Name:      Ryan Peters
 * Date:      2/19/2014
 * 
 */

public class Node
{
    private String value;
    Node next, previous;
    private Node link;
    
    public String getValue()
    {
        return value;
    }
    
    public void setValue(String v)
    {
        value = v;
    }
    
    public void setLink(Node l)
    {
        link = l;
    }
    
    public Node getLink()
    {
        return link;
    }    
}