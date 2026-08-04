package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3 ;
    JTextField textField2 ;
    JPasswordField passwordField3 ;
    JButton button1,button2,button3 ;

    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(300,125, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(275,0,300,125);
        add(image);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("Icon/Card.png"));
        Image I2 = I1.getImage().getScaledInstance(120,90, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Image = new JLabel(I3);
        Image.setBounds(700,350,120,90);
        add(Image);

        label1 = new JLabel("WELCOME TO E-BANKING");
        label1.setForeground(Color.ORANGE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(200,125,450,40);
        add(label1);

        label2 = new JLabel("Card No : ");
        label2.setFont(new Font("Arial",Font.BOLD,28));
        label2.setForeground(Color.BLACK);
        label2.setBounds(200,190,375,30);
        add(label2);

        textField2 = new JTextField() ;
        textField2.setBounds(375,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        textField2.setBackground(Color.LIGHT_GRAY);
        add(textField2);

        label3 = new JLabel("PIN : ");
        label3.setFont(new Font("Arial",Font.BOLD,28));
        label3.setForeground(Color.BLACK);
        label3.setBounds(200,250,375,30);
        add(label3);


        passwordField3 = new JPasswordField();
        passwordField3.setBounds(375,250,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,16));
        passwordField3.setBackground(Color.LIGHT_GRAY);
        add(passwordField3);


        button1 = new JButton("Sign In");
        button1.setFont(new Font("Arial",Font.BOLD,16));
        button1.setBounds(310,300,230,25);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.DARK_GRAY);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Sign Up");
        button2.setFont(new Font("Arial",Font.BOLD,16));
        button2.setBounds(310,330,230,25);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.DARK_GRAY);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("CLEAR");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setBounds(275,360,300,25);
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.DARK_GRAY);
        button3.addActionListener(this);
        add(button3);

        ImageIcon BG1 = new ImageIcon(ClassLoader.getSystemResource("Icon/login.jpg"));
        Image BG2 = BG1.getImage().getScaledInstance(850,480, java.awt.Image.SCALE_DEFAULT);
        ImageIcon BG3 = new ImageIcon(BG2);
        JLabel BImage = new JLabel(BG3);
        BImage.setBounds(0,0,850,480);
        add(BImage);



        setLayout(null);
        setSize(850,480);
        setLocation(225,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1){
                Con c = new Con() ;
                String card_no = textField2.getText() ;
                String pin_no = passwordField3.getText();
                String q = "select * from login where card_no = '"+card_no+"' and pin = '"+pin_no+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    new main_Class(pin_no);
                    setVisible(false);

                }

            } else if (e.getSource() == button2) {
                new signUp() ;
                setVisible(false);
            }else if (e.getSource() == button3) {
                textField2.setText("");
                passwordField3.setText("");
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login() ;

    }
}
