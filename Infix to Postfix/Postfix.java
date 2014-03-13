/**
 * File Name: Postfix.java
 * Name: Ryan Peters
 * Class: CS-13 Spring 2014
 * Proff: Barry Brown
 * 
 */

import java.util.Stack;
import java.lang.Math;

public class Postfix
{
    
    public double eval(String expr)
    {
        String[] tokens = expr.split(" ");
        Stack<Double> s = new Stack<Double>();
        
        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i].equals("+"))
            {
                double a = s.pop();
                double b = s.pop();
                double sum = a + b;
                s.push(sum);
            }
            else if (tokens[i].equals("-"))
            {
                double a = s.pop();
                double b = s.pop();
                double diff = b - a;
                s.push(diff);
            }
            else if (tokens[i].equals("*"))
            {
                double a = s.pop();
                double b = s.pop();
                double answer = a * b;
                s.push(answer);
            }
            else if (tokens[i].equals("/"))
            {
                double a = s.pop();
                double b = s.pop();
                double divAns = b / a;
                s.push(divAns);
            }
            else if (tokens[i].equals("^"))
            {
                double a = s.pop();
                double b = s.pop();
                double expAns = Math.pow(b, a);
                s.push(expAns);
            }
            else 
            {
                s.push(Double.parseDouble(tokens[i]));
            }
        }
        
        return s.peek();
    }
}