import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NodeTest.
 *
 * @author  Ryan Peters
 * @version 2/19/2014
 */
public class NodeTest
{
    @Test
    public void testNode()
    {
        Node a = new Node();
        a.setValue("Hello");
        assertEquals("Hello", a.getValue());
        
        Node b = new Node();
        b.setValue("Eleven");
        assertEquals("Eleven", b.getValue());
        
        a.setLink(b);
        assertEquals(b, a.getLink());
        assertEquals(null, b.getLink());
        
        assertEquals("Eleven", a.getLink().getValue());
    }
}