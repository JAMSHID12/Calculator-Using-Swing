package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;



public class Calculator implements ActionListener{

    JFrame jf;
    JButton sevenButton, eightButton, nineButton, divButton,
    fourbButton, fiveButton, sixbButton, mulbButton,
    onebButton, twoButton, threeButton, zeroButton, minusButton, 
    dotButton, plusButton, equalButton, clearbButton, modButton, squreButton, rootButton;
    JLabel displayLabel;
    boolean isoperatorClicked=false, isEqualbutton=false;
    String oldvalue, opera, result;
    

    public Calculator(){

        jf = new JFrame("Calculator");
        jf.setSize(380, 450);
        jf.setLayout(null);
        jf.setLocation(200, 100);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 40, 295, 40);
        EmptyBorder eBorder = new EmptyBorder(2, 10, 2, 10); 
        LineBorder lBorder = new LineBorder(new Color(100, 100, 100));
        displayLabel.setBorder(BorderFactory.createCompoundBorder(lBorder, eBorder));
        displayLabel.setBackground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sevenButton.setBounds(30, 100, 50, 50);
        sevenButton.setBackground(Color.gray);
        sevenButton.setOpaque(true);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setFont(new Font("Arial", Font.PLAIN, 20));
        eightButton.setBounds(90, 100, 50, 50);
        eightButton.setBackground(Color.gray);
        eightButton.setOpaque(true);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setFont(new Font("Arial", Font.PLAIN, 20));
        nineButton.setBounds(150, 100, 50, 50);
        nineButton.setBackground(Color.gray);
        nineButton.setOpaque(true);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        divButton = new JButton("/");
        divButton.setFont(new Font("Arial", Font.PLAIN, 20));
        divButton.setBounds(210, 100, 50, 50);
        divButton.setBackground(Color.gray);
        divButton.setOpaque(true);
        divButton.addActionListener(this);
        jf.add(divButton);

        modButton = new JButton("%");
        modButton.setFont(new Font("Arial", Font.PLAIN, 15));
        modButton.setBounds(270, 100, 50, 50);
        modButton.setBackground(Color.gray);
        modButton.setOpaque(true);
        modButton.addActionListener(this);
        jf.add(modButton);

        fourbButton = new JButton("4");
        fourbButton.setBounds(30, 170, 50, 50);
        fourbButton.setFont(new Font("Arial", Font.PLAIN, 20));
        fourbButton.setBackground(Color.gray);
        fourbButton.setOpaque(true);
        fourbButton.addActionListener(this);
        jf.add(fourbButton);

        fiveButton = new JButton("5");
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 20));
        fiveButton.setBounds(90, 170, 50, 50);
        fiveButton.setBackground(Color.gray);
        fiveButton.setOpaque(true);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixbButton = new JButton("6");
        sixbButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sixbButton.setBounds(150, 170, 50, 50);
        sixbButton.setBackground(Color.gray);
        sixbButton.setOpaque(true);
        sixbButton.addActionListener(this);
        jf.add(sixbButton);

        mulbButton = new JButton("x");
        mulbButton.setFont(new Font("Arial", Font.PLAIN, 20));
        mulbButton.setBounds(210, 170, 50, 50);
        mulbButton.setBackground(Color.gray);
        mulbButton.setOpaque(true);
        mulbButton.addActionListener(this);
        jf.add(mulbButton);

        squreButton = new JButton("^");
        squreButton.setFont(new Font("Arial", Font.PLAIN, 20));
        squreButton.setBounds(270, 170, 50, 50);
        squreButton.setBackground(Color.gray);
        squreButton.setOpaque(true);
        squreButton.addActionListener(this);
        jf.add(squreButton);

        onebButton = new JButton("1");
        onebButton.setFont(new Font("Arial", Font.PLAIN, 20));
        onebButton.setBounds(30, 240, 50, 50);
        onebButton.setBackground(Color.gray);
        onebButton.setOpaque(true);
        onebButton.addActionListener(this);
        jf.add(onebButton);

        twoButton = new JButton("2");
        twoButton.setFont(new Font("Arial", Font.PLAIN, 20));
        twoButton.setBounds(90, 240, 50, 50);
        twoButton.setBackground(Color.gray);
        twoButton.setOpaque(true);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setFont(new Font("Arial", Font.PLAIN, 20));
        threeButton.setBounds(150, 240, 50, 50);
        threeButton.setBackground(Color.gray);
        threeButton.setOpaque(true);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        minusButton = new JButton("-");
        minusButton.setFont(new Font("Arial", Font.PLAIN, 20));
        minusButton.setBounds(210, 240, 50, 50);
        minusButton.setBackground(Color.gray);
        minusButton.setOpaque(true);
        minusButton.addActionListener(this);
        jf.add(minusButton);
        
        rootButton = new JButton("R");
        rootButton.setFont(new Font("Arial", Font.PLAIN, 13));
        rootButton.setBounds(270, 240, 50, 50);
        rootButton.setBackground(Color.gray);
        rootButton.setOpaque(true);
        rootButton.addActionListener(this);
        jf.add(rootButton);

        zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 20));
        zeroButton.setBounds(30, 310, 50, 50);
        zeroButton.setBackground(Color.gray);
        zeroButton.setOpaque(true);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setFont(new Font("Arial", Font.PLAIN, 20));
        dotButton.setBounds(90, 310, 50, 50);
        dotButton.setBackground(Color.gray);
        dotButton.setOpaque(true);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        plusButton = new JButton("+");
        plusButton.setFont(new Font("Arial", Font.PLAIN, 20));
        plusButton.setBounds(150, 310, 50, 50);
        plusButton.setBackground(Color.gray);
        plusButton.setOpaque(true);
        plusButton.addActionListener(this);
        jf.add(plusButton);

        equalButton = new JButton("=");
        equalButton.setFont(new Font("Arial", Font.PLAIN, 20));
        equalButton.setBounds(210, 310, 50, 50);
        equalButton.setBackground(Color.gray);
        equalButton.setOpaque(true);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        clearbButton = new JButton("c");
        clearbButton.setBounds(270, 310, 50, 50);
        clearbButton.addActionListener(this);
        jf.add(clearbButton);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){

            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("7");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }

        }else if(e.getSource()==eightButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("8");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }else if(e.getSource()==nineButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("9");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }else if(e.getSource()==fourbButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("4");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }else if(e.getSource()==fiveButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("5");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
            }        
        }else if(e.getSource()==sixbButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("6");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }else if(e.getSource()==onebButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("1");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }else if(e.getSource()==twoButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("2");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }else if(e.getSource()==threeButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("3");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }else if(e.getSource()==zeroButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText("0");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }else if(e.getSource()==dotButton){
            if(isoperatorClicked || isEqualbutton){
                displayLabel.setText(".");
                isoperatorClicked = false ;
                isEqualbutton = false;
            }else{
                displayLabel.setText(displayLabel.getText()+".");
            }
        }else if(e.getSource()==clearbButton){
            displayLabel.setText("");
        }

        else if(e.getSource()==plusButton){
            isoperatorClicked = true;
            opera = "+";
            oldvalue = displayLabel.getText();


        }else if(e.getSource()==minusButton){
            isoperatorClicked = true;
            opera = "-";
            oldvalue = displayLabel.getText();


        }else if(e.getSource()==mulbButton){
            isoperatorClicked = true;
            opera = "*";
            oldvalue = displayLabel.getText();


        }else if(e.getSource()==divButton){
            isoperatorClicked = true;
            opera = "/";
            oldvalue = displayLabel.getText();


        }
        else if(e.getSource()==modButton){
            isoperatorClicked = true;
            opera = "%";
            oldvalue = displayLabel.getText();


        }else if(e.getSource()==squreButton){
            isoperatorClicked = true;
            opera = "^";
            oldvalue = displayLabel.getText();


        }
        else if(e.getSource()==rootButton){
            isoperatorClicked = true;
            opera = "R";
            oldvalue = displayLabel.getText();
        }

        else if(e.getSource()==equalButton){
            isEqualbutton = true;
            String newValue = displayLabel.getText();
            float secondValue = Float.parseFloat(newValue);
            float firstValue = Float.parseFloat(oldvalue);
            if(opera=="+"){
                float resultValue = firstValue + secondValue;
                result = Float.toString(resultValue);
            }else if(opera == "-"){
                float resultValue = firstValue - secondValue;
                result = Float.toString(resultValue);
            }else if(opera == "*"){
                float resultValue = firstValue * secondValue;
                result = Float.toString(resultValue);
            }
            else if(opera=="/"){
                float resultValue = firstValue / secondValue;
                result = Float.toString(resultValue);
            }
            else if(opera=="%"){
                float resultValue = firstValue % secondValue;
                result = Float.toString(resultValue);
            }
            else if(opera=="^"){
                Double resultValue =  Math.pow(firstValue, secondValue) ;
                result = Double.toString(resultValue);
            }
            else if(opera == "R"){
                int inter;
                inter = Math.round(firstValue);
                result = String.valueOf(Math.sqrt(inter));
            }
            
            
            displayLabel.setText(result);

        }
        
    }

    

    
}
