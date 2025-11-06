import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{

    JLabel displayLabel;
    JButton sevenBtn;
    JButton eightBtn;
    JButton nineBtn;
    JButton plusBtn;
    JButton fourBtn;
    JButton fiveBtn;
    JButton sixBtn;
    JButton minusBtn;
    JButton zeroBtn;
    JButton oneBtn;
    JButton twoBtn;
    JButton threeBtn;
    JButton equalBtn;
    JButton dotBtn;
    JButton multiplyBtn;
    JButton divideBtn;
    JButton clearBtn;
    String oldValue = "";
    String operator = "";
    boolean isOperatorClicked = false;

    public Calculator(){

        JFrame fm = new JFrame("Calculator");
        fm.setLayout(null);
        fm.setSize(450,500);
        fm.setLocation(300,150);

        displayLabel = new JLabel("0");
        displayLabel.setBounds(13,50,410,40);
        displayLabel.setBackground(java.awt.Color.LIGHT_GRAY);
        displayLabel.setForeground(java.awt.Color.black);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setOpaque(true);

        sevenBtn = new JButton("7");
        sevenBtn.setBounds(40,100,60,40);
        eightBtn = new JButton("8");
        eightBtn.setBounds(140,100,60,40);
        nineBtn = new JButton("9");
        nineBtn.setBounds(240,100,60,40);
        plusBtn = new JButton("+");
        plusBtn.setBounds(340,100,60,40);

        fourBtn = new JButton("4");
        fourBtn.setBounds(40,175,60,40);
        fiveBtn = new JButton("5");
        fiveBtn.setBounds(140,175,60,40);
        sixBtn = new JButton("6");
        sixBtn.setBounds(240,175,60,40);
        minusBtn = new JButton("-");
        minusBtn.setBounds(340,175,60,40);

        oneBtn = new JButton("1");
        oneBtn.setBounds(40,250,60,40);
        twoBtn = new JButton("2");
        twoBtn.setBounds(140,250,60,40);
        threeBtn = new JButton("3");
        threeBtn.setBounds(240,250,60,40);
        divideBtn = new JButton("/");
        divideBtn.setBounds(340,250,60,40);

        dotBtn = new JButton(".");
        dotBtn.setBounds(40,325,60,40);
        zeroBtn = new JButton("0");
        zeroBtn.setBounds(140,325,60,40);
        multiplyBtn = new JButton("*");
        multiplyBtn.setBounds(240,325,60,40);
        equalBtn = new JButton("=");
        equalBtn.setBounds(340,325,60,40);

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(40,400,360,40);

        sevenBtn.addActionListener(this);
        eightBtn.addActionListener(this);
        nineBtn.addActionListener(this);
        plusBtn.addActionListener(this);
        fourBtn.addActionListener(this);
        fiveBtn.addActionListener(this);
        sixBtn.addActionListener(this);
        minusBtn.addActionListener(this);
        oneBtn.addActionListener(this);
        twoBtn.addActionListener(this);
        threeBtn.addActionListener(this);
        divideBtn.addActionListener(this);
        zeroBtn.addActionListener(this);
        dotBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);
        equalBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        fm.add(displayLabel);
        fm.add(sevenBtn);
        fm.add(eightBtn);
        fm.add(nineBtn);
        fm.add(plusBtn);
        fm.add(fourBtn);
        fm.add(fiveBtn);
        fm.add(sixBtn);
        fm.add(minusBtn);
        fm.add(oneBtn);
        fm.add(twoBtn);
        fm.add(threeBtn);
        fm.add(divideBtn);
        fm.add(dotBtn);
        fm.add(zeroBtn);
        fm.add(multiplyBtn);
        fm.add(equalBtn);
        fm.add(clearBtn);

        fm.setVisible(true);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void display(String value){
        if(displayLabel.getText().equals("0") || isOperatorClicked)
            displayLabel.setText(value);
        else
            displayLabel.setText(displayLabel.getText() + value);
        isOperatorClicked = false;    
    }

    void setOperator(String op){
        operator = op;
        oldValue = displayLabel.getText();
        isOperatorClicked = true;
    }

    void calculate(){
        double result = 0;
        double num1 = Double.parseDouble(oldValue);
        double num2 = Double.parseDouble(displayLabel.getText());

        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 != 0)
                    result = num1 / num2;
                else{
                    displayLabel.setText("Error");
                return;
            }
                break;
        }
        displayLabel.setText(String.valueOf(result));
        isOperatorClicked = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command){
            case "0": display("0"); break;
            case "1": display("1"); break;
            case "2": display("2"); break;
            case "3": display("3"); break;
            case "4": display("4"); break;
            case "5": display("5"); break;
            case "6": display("6"); break;
            case "7": display("7"); break;
            case "8": display("8"); break;
            case "9": display("9"); break;
            case ".": display("."); break;

            case "+": setOperator("+"); break;
            case "-": setOperator("-"); break;
            case "*": setOperator("*"); break;
            case "/": setOperator("/"); break;

            case "=": calculate(); break;

            case "Clear":

                oldValue = "";
                operator = "";
                isOperatorClicked = false;
                displayLabel.setText("0");
                break;
        }
    }

    public static void main(String[] args){
        new Calculator();
    }
}