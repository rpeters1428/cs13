import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SYTest
{
    @Test
    public void infix2postfixTest()
    {
        SY s = new SY();
        assertEquals("3 4 +", s.infix2postfix("3 + 4"));
        assertEquals("3 4 + 5 +", s.infix2postfix("3 + 4 + 5"));
        assertEquals("3 4 5 6 - 7 * 8 / + * 9 -", s.infix2postfix("3 * ( 4 + ( 5 - 6 ) * 7 / 8 ) - 9"));
    }
}