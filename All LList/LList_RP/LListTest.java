import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class LListTest.
 *
 * @author  Ryan Peters
 * @version 2/19/2014
 */
public class LListTest
{
    // Test to see if the linked list even creates and is empty
    @Test
    public void testLList()
    {
        LList<String> x = new LList<String>();
        assertEquals(0, x.size());
    }
    // Test to see if the linked list adds correctly to the head of the list
    @Test
    public void testAdd()
    {
        LList<String> x = new LList<String>();
        x.add("Hello");
        assertEquals(" 0:Hello", x.toString());
        assertEquals(1, x.size());
        x.add("Ten");
        assertEquals(" 0:Ten 1:Hello", x.toString());
        assertEquals(2, x.size());
        x.clear();
        assertEquals(0, x.size());
    }
    
    // Testing to add large amounts of nodes to the list and making sure they are equal
    @Test
    public void testAdd50()
    {
        LList<String> x = new LList<String>();
        for(int i = 0; i<50; i++)
        {
            x.add("Wonderful");
        }
        assertEquals(50, x.size());
        x.clear();
        assertEquals(0, x.size());
        for(int i = 0; i < 50; i++)
        {
            x.add("Hello");
        }
        assertEquals(50, x.size());
    }
    // Test the remove() method
    @Test
    public void testRemove()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.add("Jane");
        x.add("Bob");
        x.remove();
        assertEquals(" 0:Jane 1:Sue 2:Jim", x.toString());
        x.remove();
        assertEquals(" 0:Sue 1:Jim", x.toString());
        x.remove();
        assertEquals(" 0:Jim", x.toString());
        x.remove();
        assertEquals("", x.toString());
    }
    // Test to remove a large amount of objects
    @Test
    public void testRemove10()
    {
        LList<String> b = new LList<String>();
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
    // Test the exception for Remove()
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testRemoveException()
    {
        LList<String> x = new LList<String>();
        x.remove();
    }
    // Test to see if the size method works like it should
    @Test
    public void testSize()
    {
        LList<String> x = new LList<String>();
        int length = 45;
        x.add("No");
        assertEquals(1, x.size());
        x.clear();
        for(int i = 0; i < length; i++)
        {
            x.add("Hello");
        }
        assertEquals(length, x.size());
    }
    // Test to see if the clear method does what it should do 
    @Test
    public void testClear()
    {
        LList<String> x = new LList<String>();
        x.add("No");
        assertEquals(1, x.size());
        x.clear();
        assertEquals(0, x.size());
        x.add("Pompeii");
        assertEquals(1, x.size());
        x.clear();
        assertEquals(0, x.size());
        x.clear();
        assertEquals(0, x.size());
        x.add("Ryan");
        assertEquals(1, x.size());
        x.clear();
        assertEquals(0, x.size());
    }
    // Test the get() method
    @Test
    public void testGet()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.add("Jane");
        x.add("Bob");
        assertEquals(4, x.size());
        assertEquals(" 0:Bob 1:Jane 2:Sue 3:Jim", x.toString());
        assertEquals("Bob", x.get(0));
        assertEquals("Jane", x.get(1));
        assertEquals("Sue", x.get(2));
        assertEquals("Jim", x.get(3));
    }
    
    // When working test the exception in the get(index) method
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetException()
    {
        LList<String> x = new LList<String>();
        x.add("Hello");
        x.get(1);
    }
    // Test negative numbers as the exception
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetNegativeException()
    {
        LList<String> x = new LList<String>();
        x.add("Hello");
        x.get(-1);
    }
    // Test get() for 12 or more objects
    @Test
    public void testGet12()
    {
        LList<String> b = new LList<String>();
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
        assertEquals("str5", b.get(7));
        assertEquals("str1", b.get(11));
        assertEquals("str12", b.get(0));
    }
    // Test toString() 
    @Test
    public void testToString()
    {
        LList<String> x = new LList<String>();
        x.add("str1");
        assertEquals(" 0:str1", x.toString());
        x.add("str2");
        assertEquals(" 0:str2 1:str1", x.toString());
        x.add("str3");
        assertEquals(" 0:str3 1:str2 2:str1", x.toString());
        x.clear();
        assertEquals("", x.toString());
    }
    // Test the exception for insert()
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testInsertException()
    {
        LList<String> x = new LList<String>();
        x.add("Ryan");
        x.insert("Nope", -1);
    }
    // Test insert()
    @Test
    public void testInsert()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.add("Jane");
        x.add("Bob");
        x.insert("Tom", 2);
        assertEquals(" 0:Bob 1:Jane 2:Tom 3:Sue 4:Jim", x.toString());
    }
    // Test to insert() at the beginning/head of the list
    @Test
    public void testInsertFirst()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.insert("Bob", 0);
        assertEquals(" 0:Bob 1:Sue 2:Jim", x.toString());
    }
    // Test to insert() at the end/tail of the list
    @Test
    public void testInsertLast()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.insert("Bob", 2);
        assertEquals(" 0:Sue 1:Jim 2:Bob", x.toString());
    }
    // Test delete()
    @Test
    public void testDelete()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.add("Jane");
        x.add("Bob");
        x.delete(0);
        assertEquals(" 0:Jane 1:Sue 2:Jim", x.toString());
        assertEquals(3, x.size());
        x.delete(2);
        assertEquals(" 0:Jane 1:Sue", x.toString());
        assertEquals(2, x.size());
    }
    // Test delete() exception
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testDeleteException()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.add("Jane");
        x.add("Bob");
        x.delete(5);
    }
    // Test indexOf()
    @Test
    public void testIndexOf()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.add("Jane");
        x.add("Bob");
        assertEquals(0, x.indexOf("Bob"));
        assertEquals(1, x.indexOf("Jane"));
        assertEquals(2, x.indexOf("Sue"));
        assertEquals(3, x.indexOf("Jim"));
        assertEquals(-1, x.indexOf("NoValue"));
    }
    // Test contains()
    @Test
    public void testContains()
    {
        LList<String> x = new LList<String>();
        x.add("Jim");
        x.add("Sue");
        x.add("Jane");
        x.add("Bob");
        assertEquals(true, x.contains("Bob"));
        assertEquals(true, x.contains("Jane"));
        assertEquals(true, x.contains("Sue"));
        assertEquals(true, x.contains("Jim"));
        assertEquals(false, x.contains("NoValue"));
    }
    // Test to see if we can insert JFrame in the list
    @Test
    public void testJFrame()
    {
        LList<javax.swing.JFrame> b = new LList<javax.swing.JFrame>();
        javax.swing.JFrame j1 = new javax.swing.JFrame();
        javax.swing.JFrame j2 = new javax.swing.JFrame();
        b.add(j2);
        b.add(j1);
        assertEquals(j1, b.get(0));
        assertEquals(j2, b.get(1));
    }
}