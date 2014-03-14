
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
        StringBuilder output = new StringBuilder();
        
        for(int i = 0; i < tokens.length; i++)
        {
            if(isNumber(tokens[i]) == true)
            {
                appendOutput(tokens[i]);
            }
            if(isOperator(tokens[i]) == true)
            {
                if(prec(tokens[i]) > prec(s.peek()))
                {
                    s.push(tokens[i]);
                }
                else
                {
                    while(prec(tokens[i]) >= prec(s.peek()))
                    {
                        String a = s.pop();
                        appendOutput(a);
                    }
                }
            }
            if(tokens[i].equals("("))
            {
                s.push(tokens[i]);
            }
            if(tokens[i].equals(")"))
            {
                while(s.peek().equals("("))
                {
                    appendOutput(tokens[i]);
                }
                s.pop();
            }
        }
        return output.toString();
    }
    
    public int prec(String token)
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
    
    private boolean isNumber(String token)
    {
        try{
            int num = Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean isOperator(String token)
    {
        try{
            int num = Integer.parseInt(token);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    
    private void appendOutput(String token)
    {
        String s = "";
        for(int i = 0; i < 1; i++) {
            s += ", " + i;
        }
        System.out.println(s);
    }
}