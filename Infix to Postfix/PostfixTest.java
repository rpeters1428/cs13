/**
 * File Name: Postfix.java
 * Name: Ryan Peters
 * Class: CS-13 Spring 2014
 * Proff: Barry Brown
 * 
 */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PostfixTest
{
    @Test
    public void testEval()
    {
        Postfix p = new Postfix();
        assertEquals( 7.0  , p.eval("3 4 +"), 0.00001);
        //assertEquals( 18.0  , p.eval("3 4 * 6 +"), 0.00001);
        //assertEquals( 5.0 , p.eval("3 4 2 / +"), 0.00001);
        assertEquals( -1.0 , p.eval("3 4 -"), 0.00001);
        assertEquals( -6.0 , p.eval("3 4 5 + -"), 0.00001);
        assertEquals( -11.14, p.eval("-3 -5 + 3.14 -"), 0.00001);
    }
}




