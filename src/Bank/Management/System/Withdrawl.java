package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener  {

    JButton buttonWithdraw ,buttonBack ;


    JTextField textWithdrawl ;
    String pin_no ;

    Withdrawl(String pin_no){
        this.pin_no = pin_no ;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3) ;
        image.setBounds(10,10,200,84);
        add(image);


        JLabel label1 = new JLabel("Maximum Withdrawl is 10000 Rs.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(50,150,400,35);
        add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(50,180,400,35);
        add(label2);

        textWithdrawl = new JTextField();
        textWithdrawl.setFont(new Font("System",Font.BOLD,14));
        textWithdrawl.setBounds(50,220,400,25);
        textWithdrawl.setBackground(Color.DARK_GRAY);
        textWithdrawl.setForeground(Color.WHITE);
        add(textWithdrawl);

        buttonWithdraw = new JButton("Withdraw");
        buttonWithdraw.setFont(new Font("System",Font.BOLD,16));
        buttonWithdraw.setBackground(Color.BLACK);
        buttonWithdraw.setForeground(Color.WHITE);
        buttonWithdraw.setBounds(50,362,150,35);
        buttonWithdraw.addActionListener(this);
        add(buttonWithdraw);

        buttonBack = new JButton("Back");
        buttonBack.setFont(new Font("System",Font.BOLD,16));
        buttonBack.setBackground(Color.BLACK);
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBounds(300,362,150,35);
        buttonBack.addActionListener(this);
        add(buttonBack);









        setLayout(null);
        getContentPane().setBackground(Color.DARK_GRAY);
        setSize(1550,1080);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonWithdraw) {
            try {
                String amount = textWithdrawl.getText();
                Date date = new Date();
                if (textWithdrawl.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdrawl!");
                } else {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no = '" + pin_no + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance !");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin_no + "','" + date + "','Withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin_no);

                }


            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == buttonBack) {
            new main_Class(pin_no);
            setVisible(false);
        }
    }

    public static  void main (String [] args ){

        new Withdrawl("");

    }

}
