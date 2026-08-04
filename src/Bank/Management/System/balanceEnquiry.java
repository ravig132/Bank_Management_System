package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquiry extends JFrame implements ActionListener {
    JLabel label2 ;

    JButton buttonBack ;


    String pin_no ;


    balanceEnquiry(String pin_no){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3) ;
        image.setBounds(10,10,200,84);
        add(image);

        this.pin_no = pin_no ;


        JLabel label1 = new JLabel("Your current balance is : ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(50,150,400,35);
        add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(50,180,400,35);
        add(label2);

        buttonBack = new JButton("Back");
        buttonBack.setFont(new Font("System",Font.BOLD,16));
        buttonBack.setBounds(300,406,150 ,35);
        buttonBack.setBackground(Color.BLACK);
        buttonBack.setForeground(Color.WHITE);
        buttonBack.addActionListener(this);
        add(buttonBack);


        int balance = 0 ;


        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no = '"+pin_no+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        label2.setText(""+balance);



        setLayout(null);
        getContentPane().setBackground(Color.DARK_GRAY);
        setSize(1550,1080);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonBack){
            setVisible(false);
            new main_Class(pin_no);
        }

    }

    public static void main (String [] args ){
        new balanceEnquiry("");
    }
}
