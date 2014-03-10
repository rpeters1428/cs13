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
        assertEquals("goodbye", s.pop());
        s.push("hello");
        assertEquals("hello", s.pop());
        s.push("Sierra");
        assertEquals("Sierra", s.pop());
        s.push("Science");
        assertEquals("Science", s.pop());
        assertEquals(true, s.isEmpty());
    }
    
    @Test (expected=java.util.EmptyStackException.class)
    public void testPopException()
    {
        Stack<String> s = new Stack<String>();
        s.pop();
    }
    
    @Test
    public void testPeek()
    {
        Stack<String> s = new Stack<String>();
        s.push("turbotax");
        s.push("goodbye");
        s.push("hello");
        s.push("Sierra");
        s.push("Science");
        assertEquals("Science", s.peek());
        s.pop();
        assertEquals("Sierra", s.peek());
        s.pop();
        assertEquals("hello", s.peek());
        s.pop();
        assertEquals("goodbye", s.peek());
        s.pop();
        assertEquals("turbotax", s.peek());
    }
    
    @Test (expected=java.util.EmptyStackException.class)
    public void testPeekException()
    {
        Stack<String> s = new Stack<String>();
        s.push("turbotax");
        s.push("goodbye");
        s.push("hello");
        s.push("Sierra");
        s.push("Science");
        s.clear();
        s.peek();
    }
    
    @Test
    public void testClear()
    {
        Stack<String> s = new Stack<String>();
        s.push("turbotax");
        s.push("goodbye");
        s.push("hello");
        s.push("Sierra");
        s.push("Science");
        assertEquals(false, s.isEmpty());
        s.clear();
        assertEquals(true, s.isEmpty());
    }
    
    @Test
    public void testIsEmpty()
    {
        Stack<String> s = new Stack<String>();
        s.push("turbotax");
        s.push("goodbye");
        s.push("hello");
        assertEquals(false, s.isEmpty());
        s.pop();
        assertEquals(false, s.isEmpty());
        s.pop();
        assertEquals(false, s.isEmpty());
        s.pop();
        assertEquals(true, s.isEmpty());
    }
}