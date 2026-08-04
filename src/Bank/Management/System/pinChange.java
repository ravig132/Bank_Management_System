package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pinChange extends JFrame implements ActionListener {
    String pin_no ;

    JButton buttonBack , buttonProceed;
    JPasswordField p1,p2  ;


    pinChange(String pin_no){
        this.pin_no = pin_no ;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10,10,200,84);
        add(image) ;

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(50,150,400,35);
        add(label1) ;

        JLabel label2 = new JLabel("New Pin : ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(50,200,400,35);
        add(label2);

        p1 = new JPasswordField();
        p1.setFont(new Font("System",Font.BOLD,14));
        p1.setBounds(350,205,300,25);
        p1.setBackground(Color.DARK_GRAY);
        p1.setForeground(Color.WHITE);
        add(p1);

        JLabel label3 = new JLabel("Re-Enter New Pin : ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(50,250,400,35);
        add(label3);

        p2 = new JPasswordField();
        p2.setFont(new Font("System",Font.BOLD,14));
        p2.setBounds(350,255,300,25);
        p2.setBackground(Color.DARK_GRAY);
        p2.setForeground(Color.WHITE);
        add(p2);


        JRadioButton buttonEye = getButton();
        add(buttonEye);


        buttonProceed = new JButton("Proceed");
        buttonProceed.setFont(new Font("System",Font.BOLD,16));
        buttonProceed.setBackground(Color.BLACK);
        buttonProceed.setForeground(Color.WHITE);
        buttonProceed.setBounds(50,362,150,35);
        buttonProceed.addActionListener(this);
        add(buttonProceed);

        buttonBack = new JButton("Back");
        buttonBack.setFont(new Font("System",Font.BOLD,16));
        buttonBack.setBackground(Color.BLACK);
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBounds(300,362,150,35);
        buttonBack.addActionListener(this);
        add(buttonBack);







        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }

    private JRadioButton getButton() {
        JRadioButton buttonEye = new JRadioButton("Show Pin") ;
        buttonEye.setFont(new Font("System",Font.BOLD,14));
        buttonEye.setBounds(700,255,300,25);
        buttonEye.setBackground(Color.DARK_GRAY);
        buttonEye.setForeground(Color.WHITE);
        buttonEye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonEye.isSelected()){
                    p2.setEchoChar((char)0);
                }else {
                    p2.setEchoChar('*');
                }
            }
        });
        return buttonEye;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText() ;
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered Pin Does Not Match !");
                return;
            }

            if (e.getSource() == buttonProceed){
                if(p1.getText().equals("")){

                    JOptionPane.showMessageDialog(null,"Enter New Pin!");

                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New Pin");
                }

                Conn c = new Conn() ;
                String q1 = "update bank set pin_no = '"+pin1+"' where pin_no = '"+pin_no+"'" ;
                String q2 = "update login set pin ='"+pin1+"' where pin = '"+pin_no+"'" ;
                String q3 = "update signUp3 set pin ='"+pin1+"' where pin = '"+pin_no+"'" ;

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"Pin Changed Successfully .");
                setVisible(false);
                new main_Class(pin_no) ;
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String [] args ){
        new pinChange("") ;
    }
}
