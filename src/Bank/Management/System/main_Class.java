package Bank.Management.System;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton buttonDeposit ,buttonCashWith,buttonFastCash,buttonMiniStatement,buttonPinChange,buttonBalanceEnq ,buttonExit;

    String pin_no ;

    main_Class(String pin_no){
        super("E-Banking");

        this.pin_no = pin_no ;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3) ;
        image.setBounds(10,10,200,84);
        add(image);


        JLabel labelSelectTrans = new JLabel("Please Select Your Transaction ");
        labelSelectTrans.setFont(new Font("System",Font.BOLD,28));
        labelSelectTrans.setBounds(435,100,500,35);
        labelSelectTrans.setForeground(Color.WHITE);
        labelSelectTrans.setBackground(Color.DARK_GRAY);
        add(labelSelectTrans);

        buttonDeposit = new JButton("DEPOSIT");
        buttonDeposit.setFont(new Font("System",Font.BOLD,20));
        buttonDeposit.setForeground(Color.BLACK);
        buttonDeposit.setBackground(Color.CYAN);
        buttonDeposit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonDeposit.setBounds(320,200,300,35);
        buttonDeposit.addActionListener(this);
        add(buttonDeposit);


        buttonCashWith = new JButton("CASH WITHDRAWL");
        buttonCashWith.setFont(new Font("System",Font.BOLD,20));
        buttonCashWith.setForeground(Color.BLACK);
        buttonCashWith.setBackground(Color.CYAN);
        buttonCashWith.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonCashWith.setBounds(650,200,300,35);
        buttonCashWith.addActionListener(this);
        add(buttonCashWith);

        buttonFastCash = new JButton("FAST CASH");
        buttonFastCash.setFont(new Font("System",Font.BOLD,20));
        buttonFastCash.setForeground(Color.BLACK);
        buttonFastCash.setBackground(Color.CYAN);
        buttonFastCash.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonFastCash.setBounds(320,280,300,35);
        buttonFastCash.addActionListener(this);
        add(buttonFastCash);

        buttonMiniStatement = new JButton("MINI STATEMENT");
        buttonMiniStatement.setFont(new Font("System",Font.BOLD,20));
        buttonMiniStatement.setForeground(Color.BLACK);
        buttonMiniStatement.setBackground(Color.CYAN);
        buttonMiniStatement.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonMiniStatement.setBounds(650,280,300,35);
        buttonMiniStatement.addActionListener(this);
        add(buttonMiniStatement);


        buttonPinChange = new JButton("PIN CHANGE");
        buttonPinChange.setFont(new Font("System",Font.BOLD,20));
        buttonPinChange.setForeground(Color.BLACK);
        buttonPinChange.setBackground(Color.CYAN);
        buttonPinChange.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonPinChange.setBounds(320,360,300,35);
        buttonPinChange.addActionListener(this);
        add(buttonPinChange);


        buttonBalanceEnq = new JButton("BALANCE ENQUIRY");
        buttonBalanceEnq.setFont(new Font("System",Font.BOLD,20));
        buttonBalanceEnq.setForeground(Color.BLACK);
        buttonBalanceEnq.setBackground(Color.CYAN);
        buttonBalanceEnq.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonBalanceEnq.setBounds(650,360,300,35);
        buttonBalanceEnq.addActionListener(this);
        add(buttonBalanceEnq);

        buttonExit = new JButton("EXIT");
        buttonExit.setFont(new Font("System",Font.BOLD,20));
        buttonExit.setForeground(Color.BLACK);
        buttonExit.setBackground(Color.CYAN);
        buttonExit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonExit.setBounds(650,500,300,35);
        buttonExit.addActionListener(this);
        add(buttonExit);







        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
        getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource() == buttonDeposit){
                new Deposit(pin_no);
                setVisible(false);
            } else if (e.getSource() == buttonExit) {
                System.exit(0);
            } else if (e.getSource() == buttonCashWith) {
                new Withdrawl(pin_no) ;
                setVisible(false);
            } else if (e.getSource() == buttonBalanceEnq) {
                new balanceEnquiry(pin_no);
                setVisible(false);
            } else if (e.getSource()==buttonFastCash) {
                new fastCash(pin_no) ;
                setVisible(false);

            } else if (e.getSource() == buttonPinChange) {
                new pinChange(pin_no);
                setVisible(false);

            } else if (e.getSource() == buttonMiniStatement) {
                new miniStatement(pin_no);
                setVisible(false);
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
    new main_Class("") ;
    }
}
