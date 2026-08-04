package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    JButton buttonDeposit ,buttonBack ;


    JTextField textDeposit ;
    String pin_no ;
     Deposit(String pin_no){
         super("DEPOSIT");
         this.pin_no = pin_no;

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
         Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3) ;
         image.setBounds(10,10,200,84);
         add(image);


         JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
         label1.setForeground(Color.WHITE);
         label1.setFont(new Font("System",Font.BOLD,16));
         label1.setBounds(50,150,400,35);
         add(label1);

         textDeposit = new JTextField();
         textDeposit.setFont(new Font("System",Font.BOLD,14));
         textDeposit.setBounds(50,200,400,25);
         textDeposit.setBackground(Color.DARK_GRAY);
         textDeposit.setForeground(Color.WHITE);
         add(textDeposit);

         buttonDeposit = new JButton("Deposit");
         buttonDeposit.setFont(new Font("System",Font.BOLD,16));
         buttonDeposit.setBackground(Color.BLACK);
         buttonDeposit.setForeground(Color.WHITE);
         buttonDeposit.setBounds(50,362,150,35);
         buttonDeposit.addActionListener(this);
         add(buttonDeposit);

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
         String amount = textDeposit.getText() ;
        Date date = new Date() ;

        try {
            if (e.getSource() == buttonDeposit){
               if (amount.equals("")){
                   JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
               }else {
                   Conn c1 = new Conn() ;
                   c1.statement.executeUpdate("insert into bank values('"+pin_no+"','"+date+"','Deposit','"+amount+"')");
                   JOptionPane.showMessageDialog(null,"Amount Rs. "+amount+" Deposited Successfully");
                   setVisible(false);
                   new main_Class(pin_no) ;
               }
            }else if (e.getSource() == buttonBack) {
                new main_Class(pin_no) ;
                setVisible(false);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("") ;
    }
}
