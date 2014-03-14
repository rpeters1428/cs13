import java.util.Stack;

public class SY
{
    public static String infix2postfix(String infix) 
    { 
        Stack<String> stack = new Stack<String>(); 
         
        String postfix = ""; 
         
        String[] tokens = infix.split(" ");
         
        for (int i = 0; i < tokens.length; i++) 
        { 
            String c = tokens[i]; 
            String o = ""; 
             
            if (isOperand(c)) 
            { 
                postfix += c + " "; 
            } 
            else if (isOperator(c)) 
            { 
                while (stack.isEmpty() == false) 
                { 
                    o = stack.pop(); 
                    if (isHigher(c, o)) 
                    { 
                        stack.push(o); 
                        break; 
                    } 
                     
                    postfix += o+" "; 
                } 
                stack.push(c); 
            } 
            else if (isParen(c)) 
            { 
                if (c.equals(")")) 
                { 
                    while (stack.isEmpty() == false) 
                    { 
                        o = stack.pop(); 
                        if (o.equals("(")) 
                        { 
                            break; 
                        } 
                        postfix += o+" "; 
                    } 
                } 
                else 
                    stack.push(c); 
            } 
        } 
        while (stack.isEmpty() == false) 
        { 
            String o = stack.pop(); 
            postfix += o+" "; 
        } 
        postfix = postfix.trim();
        return postfix; 
    } 
    public static boolean isOperand(String op) 
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
    public static boolean isOperator(String op) 
    { 
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"); 
    } 
    public static boolean isHigher(String op1, String op2) 
    { 
        if (op1.equals("*") || op1.equals("/")) 
            if (op2.equals("+") || op2.equals("-"))        
                return true; 
         
        if (op1.equals("*") || op1.equals("/") || op1.equals("+") || op1.equals("-")) 
            if (op2.equals("("))        
                return true; 
         
        return false; 
    } 
    public static boolean isParen(String str) 
    { 
        return str.equals("(") || str.equals(")"); 
    } 
}