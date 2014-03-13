<<<<<<< HEAD
import java.util.Stack;
import java.lang.Math;

public class ShuntingYard
{
    public String infix2postfix(String infix)
    {
        // TODO
        // Set up a stack of Strings
        // Split the string using spaces as the delimiter
        // Implement the ShuntingYard algorithm
        // Return the resulting String
        
        String[] tokens = infix.split(" ");
        Stack<String> s = new Stack<String>();
        
        for(int i = 0; i < tokens.length; i++)
        {
            
        }
        
        return "";
    }
    
    public int precedence(String token)
    {
        if(token.equals("^"))
        {
            return 4;
        }
        else if(token.equals("*"))
        {
            return 3;
        }
        else if(token.equals("/"))
        {
            return 3;
        }
        else if(token.equals("+"))
        {
            return 2;
        }
        else
        {
            return 2;
        }
    }
=======
public class ShuntingYard
{
    
    
>>>>>>> 44e403a4422f23c330b064b11b5a87ea05cec109
}