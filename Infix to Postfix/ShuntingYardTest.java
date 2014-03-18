import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShuntingYardTest.
 *
 * @author  Ryan Peters
 * @version 3/17/2014
 */
public class ShuntingYardTest
{
    @Test
    public void infix2postfixTest()
    {
        ShuntingYard s = new ShuntingYard();
        assertEquals("3 4 +", s.infix2postfix("3 + 4"));
        assertEquals("3 4 + 5 +", s.infix2postfix("3 + 4 + 5"));
        assertEquals("3 4 5 6 - 7 * 8 / + * 9 -", s.infix2postfix("3 * ( 4 + ( 5 - 6 ) * 7 / 8 ) - 9"));
        assertEquals("3 5 7 / 3 4 2 / * + 16 +", s.infix2postfix("3 + 5 / 7 * 3 ( 4 / 2 ) + 16"));
    }
}