import java.util.Stack;

public class ShuntingYard
{
    public String infix2postfix(String infix)
    {
        String postfix = "";
        
        String[] tokens = infix.split(" ");
        Stack<String> s = new Stack<String>();
        
        for (int i = 0; i < tokens.length; i++)
        {
            String c = tokens[i]; 
            String o = "";
            
            if(isNumber(c))
            {
                postfix += c +" ";
            }
            else if (isNumber(c))
            {
                while (s.isEmpty() == false)
                {
                    o = s.pop();
                    
                    if (isHigher(c, o))
                    {
                        s.push(o); 
                        break;
                    }
                    postfix += o +" ";
                }
                s.push(c); 
            }
            else if (isParen(c))
            {
                if (c.equals(")"))
                {
                    while (s.isEmpty() == false)
                    {
                        o = s.pop();
                        if(s.equals("("))
                        {
                            o = s.pop();
                        }
                        postfix += o + " ";
                    }
                }
                else
                {
                    s.push(c);
                }
            }
        }
        while (s.isEmpty() == false) 
        { 
            String o = s.pop(); 
            postfix += o + " "; 
        }
        postfix = postfix.trim();
        return postfix;
    }
    
    private boolean isOperand(String op) 
    { 
        try 
        { 
            Double.parseDouble(op); 
            return true; 
        } 
        catch(NumberFormatException nfe) 
        { 
            return false; 
        } 
    } 
    
    private boolean isNumber(String op) 
    { 
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"); 
    }
    
    private boolean isHigher(String op1, String op2) 
    { 
        if (op1.equals("*") || op1.equals("/")) 
            if (op2.equals("+") || op2.equals("-"))        
                return true; 
         
        if (op1.equals("*") || op1.equals("/") || op1.equals("+") || op1.equals("-")) 
            if (op2.equals("("))        
                return true; 
         
        return false; 
    } 
    private boolean isParen(String str) 
    { 
        return str.equals("(") || str.equals(")"); 
    }
}