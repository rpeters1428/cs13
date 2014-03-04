import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BetterArrayTest.
 *
 * @author  Barry Brown
 * @version 2/5/2014
 */
public class BetterArrayTest
{   
    @Test
    public void testCreateArray()
    {
        BetterArray<String> b = new BetterArray<String>();
        assertEquals(0, b.size());
    }
    
    @Test
    public void testAddToArray()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("Hello");
        assertEquals(1, b.size());
        b.add("Bye");
        assertEquals(2, b.size());
        b.add("Adios");
        assertEquals(3, b.size());
    }
    
    @Test
    public void testAdd12()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("str1");
        b.add("str2");
        b.add("str3");
        b.add("str4");
        b.add("str5");
        b.add("str6");
        b.add("str7");
        b.add("str8");
        b.add("str9");
        b.add("str10");
        b.add("str11");
        b.add("str12");
        assertEquals(12, b.size());
    }
    
    @Test
    public void testAdd100()
    {
        BetterArray<String> b = new BetterArray<String>();
        
        for (int i = 0; i < 50; i++)
            b.add("str" + i);
        assertEquals(50, b.size());
        
        for (int i = 0; i < 50; i++)
            b.add("morestr" + i);
            
        assertEquals(100, b.size());
    }
   
    
    @Test
    public void testGet()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("Hello");
        b.add("Bye");
        assertEquals("Hello", b.get(0));
        assertEquals("Bye", b.get(1));
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetException()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("Hello");
        b.get(1);
        // No more code after this, because the exception
        // will cause the method to exit.
        // Don't create more that one exception per test method.
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetNegativeException()
    {
        BetterArray b = new BetterArray();
        b.get(-1);
    }
    
    @Test
    public void testGet12()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("str1");
        b.add("str2");
        b.add("str3");
        b.add("str4");
        b.add("str5");
        b.add("str6");
        b.add("str7");
        b.add("str8");
        b.add("str9");
        b.add("str10");
        b.add("str11");
        b.add("str12");
        assertEquals("str8", b.get(7));
        assertEquals("str12", b.get(11));
        assertEquals("str1", b.get(0));
    }
    
    
    
    @Test
    public void testToString()
    {
        BetterArray<String> b = new BetterArray<String>();
        assertEquals("", b.toString());
        b.add("hello");
        assertEquals("0:hello", b.toString());
        b.add("bye");
        assertEquals("0:hello, 1:bye", b.toString());
        b.add("adios");
        assertEquals("0:hello, 1:bye, 2:adios", b.toString());
    }
    
    
    
    @Test
    public void testRemove()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.add("hola");
        b.remove();
        assertEquals(1, b.size());
        b.remove();
        assertEquals(0, b.size());
    }
    
    @Test
    public void testRemove10()
    {
        BetterArray<String> b = new BetterArray<String>();
        for (int i = 0; i < 10; i++)
            b.add("str" + i);
        assertEquals(10, b.size());
        b.remove();
        assertEquals(9, b.size());
        b.remove();
        b.remove();
        b.remove();
        b.remove();
        b.remove();
        b.remove();
        b.remove();
        b.remove();
        b.remove();
        assertEquals(0, b.size());
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testRemoveException()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.remove();
        b.remove();
    }
    
   
    
    @Test
    public void testInsert()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.add("bye");
        b.insert(1, "adios");
        assertEquals("hello", b.get(0));
        assertEquals("adios", b.get(1));
        assertEquals("bye", b.get(2));
        assertEquals(3, b.size());
        
        b.insert(1, "buenos dias");
        assertEquals(4, b.size());
        assertEquals("hello", b.get(0));
        assertEquals("buenos dias", b.get(1));
        assertEquals("adios", b.get(2));
        
        b.insert(0, "hi");
        assertEquals(5, b.size());
        assertEquals("hi", b.get(0));
        assertEquals("hello", b.get(1));
        
        b.insert(4, "see ya");
        assertEquals(6, b.size());
        assertEquals("see ya", b.get(4));
        assertEquals("bye", b.get(5));
    }
    
    @Test
    public void testInsert11()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("one");
        b.insert(0, "two");
        b.insert(0, "three");
        b.insert(0, "four");
        b.insert(0, "five");
        b.insert(0, "six");
        b.insert(0, "seven");
        b.insert(0, "eight");
        b.insert(0, "nine");
        b.insert(0, "ten");
        b.insert(0, "eleven");
        assertEquals(11, b.size());
        assertEquals("eleven", b.get(0));
        assertEquals("ten", b.get(1));
        assertEquals("two", b.get(9));
        assertEquals("one", b.get(10));
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testInsertException()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.insert(1, "bye");
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testInsertNegative()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.insert(-1, "hello");
    }
    
    
    
    @Test
    public void testDelete1()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.delete(0);
        assertEquals(0, b.size());
    }
    
    @Test
    public void testDeleteSeveral()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.add("bye");
        b.add("adios");
        b.add("ciao");
        b.add("see ya");
        b.delete(0);
        assertEquals(4, b.size());
        assertEquals("bye", b.get(0));
        assertEquals("adios", b.get(1));
        assertEquals("ciao", b.get(2));
        assertEquals("see ya", b.get(3));
        
        b.delete(3);
        assertEquals(3, b.size());
        assertEquals("bye", b.get(0));
        assertEquals("adios", b.get(1));
        assertEquals("ciao", b.get(2));
        
        b.delete(0);
        b.delete(0);
        b.delete(0);
        assertEquals(0, b.size());
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testDeleteException()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.delete(1);
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testDeleteNegative()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.delete(-1);
    }
    
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testDeleteEmpty()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("hello");
        b.delete(0);
        b.delete(0);
    }
    
    
    
    @Test
    public void testIndexOf()
    {
        BetterArray<String> b = new BetterArray<String>();
        
        for (int i = 0; i < 20; i++)
            b.add("str" + i);
        
        assertEquals(0, b.indexOf("str0"));
        assertEquals(19, b.indexOf("str19"));
        assertEquals(-1, b.indexOf("not found"));
    }
    
    @Test
    public void testIndexOfWithDuplicates()
    {
        BetterArray<String> b = new BetterArray<String>();
        b.add("str1");
        b.add("str2");
        b.add("str3");
        b.add("str2");
        b.add("str3");
        
        assertEquals(0, b.indexOf("str1"));
        assertEquals(1, b.indexOf("str2"));
        assertEquals(2, b.indexOf("str3"));
    }
    
    
    
    @Test
    public void testContains()
    {
        BetterArray<String> b = new BetterArray<String>();
        
        for (int i = 0; i < 20; i++)
            b.add("str" + i);
            
        assertTrue(b.contains("str0"));
        assertTrue(b.contains("str19"));
        assertFalse(b.contains("not found"));
    }
    
    
    // Make sure BetterArray works with different kinds
    // of objects.
    
    
    @Test
    public void testInteger()
    {
        BetterArray<Integer> b = new BetterArray<Integer>();
        for (int i = 0; i < 50; i++)
            b.add(i);
        assertEquals(50, b.size());
        assertEquals(0, (int)b.get(0));
        assertEquals(1, (int)b.get(1));
        assertEquals(49, (int)b.get(49));
    }
    
    
    
    @Test
    public void testJFrame()
    {
        BetterArray<javax.swing.JFrame> b = new BetterArray<javax.swing.JFrame>();
        javax.swing.JFrame j1 = new javax.swing.JFrame();
        javax.swing.JFrame j2 = new javax.swing.JFrame();
        b.add(j2);
        b.add(j1);
        assertEquals(j2, b.get(0));
        assertEquals(j1, b.get(1));
    }
}