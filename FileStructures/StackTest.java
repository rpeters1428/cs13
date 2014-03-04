import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StackTest
{
    @Test
    public void testStack()
    {
        Stack<String> s = new Stack<String>();
        assertTrue(s.isEmpty());
        s.push("hello");
        assertFalse(s.isEmpty());
        assertEquals("hello", s.peek());
        assertEquals("hello", s.pop());
        assertTrue(s.isEmpty());
        
        s.push("goodbye");
        s.push("hello");
        s.push("Sierra");
        s.push("Science");
        
        assertEquals("Science", s.peek());
        assertEquals("Science", s.pop());
        assertEquals("Sierra", s.pop());
        assertEquals("hello", s.pop());
        assertEquals("goodbye", s.pop());
    }
}