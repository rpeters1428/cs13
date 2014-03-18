/**
 * File Name: ShuntingYard.java
 * Author: Ryan Peters
 * Date: 3/17/2014
 * Professor: Barry Brown
 */

import java.util.Stack;

public class ShuntingYard
{
    // Convert infix to postfix
    public static String infix2postfix(String infix) 
    {
        // Create anew stack, empty String and split String using spaces
        Stack<String> s = new Stack<String>(); 
         
        String postfix = ""; 
         
        String[] tokens = infix.split(" ");
        // Loop through the expression of tokens using tokens.length
        for (int i = 0; i < tokens.length; i++) 
        {
            // Put the tokens[i] into a String a
            String a = tokens[i]; 
            String output = ""; 
            // If the token is a Number Append to output
            if (isNumb(a)) 
            { 
                postfix += a + " "; 
            } 
            // Else if it is a operator
            else if (isOp(a)) 
            { 
                // While the Stack is not empty
                while (s.isEmpty() == false) 
                {   
                    // Pop
                    output = s.pop();
                    // If precedence is higher 
                    if (isHigher(a, output)) 
                    { 
                        // Push it to the output
                        s.push(output); 
                        break; 
                    } 
                    // Append to the output
                    postfix += output + " "; 
                } 
                // Push it
                s.push(a); 
            } 
            // If it is a "(" or ")"
            else if (isParen(a)) 
            { 
                // If it is a ")"
                if (a.equals(")")) 
                { 
                    // While the stack is not empty
                    while (s.isEmpty() == false) 
                    { 
                        // Pop
                        output = s.pop(); 
                        // If the output equals "("
                        if (output.equals("(")) 
                        { 
                            break; 
                        } 
                        // Append to the output
                        postfix += output + " "; 
                    } 
                }
                // Else push
                else 
                    s.push(a); 
            } 
        } 
        // While it is not empty
        while (s.isEmpty() == false) 
        { 
            // Pop and append to the output
            String o = s.pop(); 
            postfix += o + " "; 
        } 
        // Trim it and return the "answer"
        postfix = postfix.trim();
        return postfix; 
    }
    // Check to see if the element is a paren
    public static boolean isParen(String str) 
    { 
        return str.equals("(") || str.equals(")"); 
    }
    // Check to see if it is a number or not
    public static boolean isNumb(String op) 
    { 
        try 
        { 
            Double.parseDouble(op); 
            return true; 
        } 
        catch (NumberFormatException nfe) 
        { 
            return false; 
        } 
    } 
    // Check to see if it's an operator
    public static boolean isOp(String str) 
    { 
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    } 
    // Check to see if it is a higher priority in the calc of the expression
    public static boolean isHigher(String str1, String str2) 
    { 
        if (str1.equals("*") || str1.equals("/")) 
        {
            if (str2.equals("+") || str2.equals("-")) 
            {
                return true;
            }
        }
         
        if (str1.equals("*") || str1.equals("/") || str1.equals("+") || str1.equals("-"))
        {
            if (str2.equals("("))
            {
                return true;
            }
        }
        return false;
    } 
}