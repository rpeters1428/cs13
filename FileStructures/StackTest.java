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
    
    @Test
    public void testPush()
    {
        Stack<String> s = new Stack<String>();
        s.push("goodbye");
        assertEquals("goodbye", s.peek());
        s.push("hello");
        assertEquals("hello", s.peek());
        s.push("Sierra");
        assertEquals("Sierra", s.peek());
        s.push("Science");
        assertEquals("Science", s.peek());
    }
    
    @Test
    public void testPop()
    {
        Stack<String> s = new Stack<String>();
        s.push("goodbye");
        s.push("James");
        s.push("hello");
        s.push("Sierra");
        s.push("Science");
        assertEquals("Science", s.pop());
        assertEquals("Sierra", s.pop());
        assertEquals("hello", s.pop());
        assertEquals("James", s.pop());
        assertEquals("goodbye", s.pop());
        assertEquals(true, s.isEmpty());
    }
    
    @Test
    public void testPeek()
    {
        Stack<String> s = new Stack<String>();
        s.push("goodbye");
        assertEquals("goodbye", s.peek());
        s.push("James");
        assertEquals("James", s.peek());
        s.push("hello");
        assertEquals("hello", s.peek());
        s.push("Sierra");
        assertEquals("Sierra", s.peek());
        s.push("Science");
        assertEquals("Science", s.peek());
    }
    
    @Test
    public void testClear()
    {
        Stack<String> s = new Stack<String>();
        s.push("goodbye");
        s.push("James");
        s.push("hello");
        s.push("Sierra");
        s.push("Science");
        s.clear();
        assertEquals(true, s.isEmpty());
    }
}