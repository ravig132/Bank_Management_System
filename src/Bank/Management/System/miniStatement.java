package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class miniStatement extends JFrame implements ActionListener {

    JButton buttonExit ;
    String pin_no ;
    miniStatement(String pin_no){
        this.pin_no = pin_no ;


        JLabel label1 = new JLabel();
        label1.setBounds(20,120,400,300);
        add(label1);

        JLabel label2 = new JLabel("Bank Of Ravi") ;
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,450,300,20);
        add(label4);

        try {
            Conn c = new Conn() ;
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin ='"+pin_no+"'");
            while (resultSet.next()){
                label3.setText("Card Number : "+resultSet.getString("card_no").substring(0,4)+"XXXXXXXX"+resultSet.getString("card_no").substring(12));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            int balance =  0 ;
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no = '"+pin_no+"'");
            while (resultSet.next()){
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            label4.setText("Your Total Balance is Rs. : "+balance);

        } catch (Exception e) {
            e.printStackTrace();
        }



        buttonExit = new JButton("Exit");
        buttonExit.setBounds(250,500,100,25);
        buttonExit.setBackground(Color.BLACK);
        buttonExit.setForeground(Color.WHITE);
        buttonExit.addActionListener(this);
        add(buttonExit);





        setSize(400,600);
        setLayout(null);
        setLocation(20,20);
        getContentPane().setBackground(new Color(255,204,204));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        System.exit(0);
    }

    public static void main (String [] args ){
        new miniStatement("");
    }
}
