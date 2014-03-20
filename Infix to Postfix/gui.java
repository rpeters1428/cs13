import acm.gui.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;

public class gui extends Program
{
    private JTextField infixInput;
    private JTextField postfixOutput;
    private JTextField answerOutput;
    Postfix p = new Postfix();
    ShuntingYard s = new ShuntingYard();
    
    public gui()
    {
        this.start();
        this.setSize(300, 350);
    }
    
    public void init()
    {
        JLabel infixLabel = new JLabel("Infix Expression");
        JLabel postfixLabel = new JLabel("Postfix Output");
        JLabel answer = new JLabel("Final Answer");
        
        JButton calcButton = new JButton("Calculate");
        calcButton.setActionCommand("calc");
        
        JButton clearButton = new JButton("Clear");
        clearButton.setActionCommand("clear");
        
        infixInput = new JTextField();
        postfixOutput = new JTextField();
        answerOutput = new JTextField();
        
        TableLayout t = new TableLayout(4, 2);
        this.setLayout(t);
        
        this.add(infixLabel);
        this.add(infixInput);
        this.add(postfixLabel);
        this.add(postfixOutput);
        this.add(calcButton);
        this.add(clearButton);
        this.add(answer);
        this.add(answerOutput);
        postfixOutput.setEnabled(false);
        answerOutput.setEnabled(false);
        
        addActionListeners();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();
        if(cmd.equals("calc"))
        {
            String infix = infixInput.getText();
            String postfix = s.infix2postfix(infix);
            postfixOutput.setText("" + postfix);
            
            double result = p.eval(postfix);
            answerOutput.setText("" + result);
        }
        else if(cmd.equals("clear"))
        {
            infixInput.setText(null);
            postfixOutput.setText(null);
            answerOutput.setText(null);
        }
    }
}