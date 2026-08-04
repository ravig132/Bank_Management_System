package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {

    JButton button100,button200,button500,button1000,button2000,button10000 ,buttonBack;

    String pin_no ;

    fastCash(String pin_no){

        this.pin_no = pin_no ;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3) ;
        image.setBounds(10,10,200,84);
        add(image);


        JLabel labelSelectTrans = new JLabel("SELECT WITHDRAWL AMOUNT");
        labelSelectTrans.setFont(new Font("System",Font.BOLD,28));
        labelSelectTrans.setBounds(420,100,500,35);
        labelSelectTrans.setForeground(Color.WHITE);
        labelSelectTrans.setBackground(Color.DARK_GRAY);
        add(labelSelectTrans);

        button100 = new JButton("Rs. 100");
        button100.setFont(new Font("System",Font.BOLD,20));
        button100.setForeground(Color.BLACK);
        button100.setBackground(Color.CYAN);
        button100.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button100.setBounds(320,200,300,35);
        button100.addActionListener(this);
        add(button100);


        button200 = new JButton("Rs. 200");
        button200.setFont(new Font("System",Font.BOLD,20));
        button200.setForeground(Color.BLACK);
        button200.setBackground(Color.CYAN);
        button200.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button200.setBounds(650,200,300,35);
        button200.addActionListener(this);
        add(button200);

        button500 = new JButton("Rs. 500");
        button500.setFont(new Font("System",Font.BOLD,20));
        button500.setForeground(Color.BLACK);
        button500.setBackground(Color.CYAN);
        button500.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button500.setBounds(320,280,300,35);
        button500.addActionListener(this);
        add(button500);

        button1000 = new JButton("Rs. 1000");
        button1000.setFont(new Font("System",Font.BOLD,20));
        button1000.setForeground(Color.BLACK);
        button1000.setBackground(Color.CYAN);
        button1000.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button1000.setBounds(650,280,300,35);
        button1000.addActionListener(this);
        add(button1000);


        button2000 = new JButton("Rs. 2000");
        button2000.setFont(new Font("System",Font.BOLD,20));
        button2000.setForeground(Color.BLACK);
        button2000.setBackground(Color.CYAN);
        button2000.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button2000.setBounds(320,360,300,35);
        button2000.addActionListener(this);
        add(button2000);


        button10000 = new JButton("Rs. 10000");
        button10000.setFont(new Font("System",Font.BOLD,20));
        button10000.setForeground(Color.BLACK);
        button10000.setBackground(Color.CYAN);
        button10000.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button10000.setBounds(650,360,300,35);
        button10000.addActionListener(this);
        add(button10000);

        buttonBack = new JButton("Back");
        buttonBack.setFont(new Font("System",Font.BOLD,20));
        buttonBack.setForeground(Color.BLACK);
        buttonBack.setBackground(Color.CYAN);
        buttonBack.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonBack.setBounds(650,500,300,35);
        buttonBack.addActionListener(this);
        add(buttonBack);







        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
        getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonBack){
            setVisible(false);
            new main_Class(pin_no);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);

            Conn c = new Conn() ;

            Date date = new Date();

            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no = '"+pin_no+"'");
                int balance = 0 ;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != buttonBack && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance !");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin_no+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully.");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin_no);
        }


    }

    public static  void main (String [] args ){

        new fastCash("");

    }
}