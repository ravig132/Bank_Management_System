package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUp3 extends JFrame implements ActionListener {

    JCheckBox boxATMCard ,boxNetBanking ,boxMobileBanking ,boxEmailAlerts ,boxChequeBook ,boxStatement ;

    JRadioButton buttonSaving,buttonFixedDep,buttonCurrent,buttonDep ;

    JButton submit , cancel ;

    String formno ;
    signUp3(String first){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,200,84);
        add(image);

        this.formno = first ;

        JLabel labelPage = new JLabel("Page 3");
        labelPage.setFont(new Font("Raleway",Font.BOLD,22));
        labelPage.setBounds(375,10,600,30);
        add(labelPage);

        JLabel labelAccDetails = new JLabel("Account Details : ");
        labelAccDetails.setFont(new Font("Raleway",Font.BOLD,22));
        labelAccDetails.setBounds(325,60,600,40);
        add(labelAccDetails);

        JLabel labelAccType = new JLabel("Account Type : ");
        labelAccType.setFont(new Font("Raleway",Font.BOLD,20));
        labelAccType.setBounds(10,120,200,30);
        add(labelAccType);

        buttonSaving = new JRadioButton("Saving Account");
        buttonSaving.setFont(new Font("Raleway",Font.BOLD,16));
        buttonSaving.setBounds(200,140,300,30);
        buttonSaving.setBackground(new Color(213,255,255));
        add(buttonSaving);

        buttonCurrent = new JRadioButton("Current Account");
        buttonCurrent.setBackground(new Color(213,255,255));
        buttonCurrent.setFont(new Font("Raleway",Font.BOLD,16));
        buttonCurrent.setBounds(510,140,300,30);
        add(buttonCurrent);


        buttonFixedDep = new JRadioButton("Fixed Deposit Account");
        buttonFixedDep.setFont(new Font("Raleway",Font.BOLD,16));
        buttonFixedDep.setBounds(200,190,300,30);
        buttonFixedDep.setBackground(new Color(213,255,255));
        add(buttonFixedDep);


        buttonDep = new JRadioButton("Recurring Deposit Account");
        buttonDep.setBackground(new Color(213,255,255));
        buttonDep.setFont(new Font("Raleway",Font.BOLD,16));
        buttonDep.setBounds(510,190,300,30);
        add(buttonDep);


        ButtonGroup group1 = new ButtonGroup();

        group1.add(buttonSaving);
        group1.add(buttonCurrent);
        group1.add(buttonFixedDep);
        group1.add(buttonDep);

        JLabel labelCardNo = new JLabel("Card Number : ");
        labelCardNo.setFont(new Font("Raleway",Font.BOLD,20));
        labelCardNo.setBounds(10,250,200,30);
        add(labelCardNo);

        JLabel labelCardDetails = new JLabel("(Your 16 digit Card No)");
        labelCardDetails.setFont(new Font("Raleway",Font.BOLD,12));
        labelCardDetails.setBounds(10,280,300,20);
        add(labelCardDetails);

        JLabel labelCardDigits = new JLabel("XXXX-XXXX-XXXX-4841");
        labelCardDigits.setFont(new Font("Raleway",Font.BOLD,20));
        labelCardDigits.setBounds(200,250,400,30);
        add(labelCardDigits);

        JLabel labelCardDigitsInfo = new JLabel("(It would appear on debit card , cheque and bank statements)");
        labelCardDigitsInfo.setFont(new Font("Raleway",Font.BOLD,12));
        labelCardDigitsInfo.setBounds(200,280,400,20);
        add(labelCardDigitsInfo);


        JLabel labelPin = new JLabel("PIN : ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(10,320,200,30);
        add(labelPin);

        JLabel labelHiddenPin = new JLabel("****");
        labelHiddenPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelHiddenPin.setBounds(200,325,400,30);
        add(labelHiddenPin);

        JLabel labelPinDetails = new JLabel("(4-Digit Password)");
        labelPinDetails.setFont(new Font("Raleway",Font.BOLD,12));
        labelPinDetails.setBounds(10,350,200,20);
        add(labelPinDetails);

        JLabel labelServices = new JLabel("Services Required : ");
        labelServices.setFont(new Font("Raleway",Font.BOLD,20));
        labelServices.setBounds(10,390,200,30);
        add(labelServices);

        boxATMCard = new JCheckBox("ATM Card");
        boxATMCard.setFont(new Font("Raleway",Font.BOLD,16));
        boxATMCard.setBounds(200,420,300,30);
        boxATMCard.setBackground(new Color(213,255,255));
        add(boxATMCard);

        boxNetBanking = new JCheckBox("Internet Banking");
        boxNetBanking.setFont(new Font("Raleway",Font.BOLD,16));
        boxNetBanking.setBounds(510,420,300,30);
        boxNetBanking.setBackground(new Color(213,255,255));
        add(boxNetBanking);


        boxMobileBanking = new JCheckBox("Mobile Banking");
        boxMobileBanking.setFont(new Font("Raleway",Font.BOLD,16));
        boxMobileBanking.setBounds(200,470,300,30);
        boxMobileBanking.setBackground(new Color(213,255,255));
        add(boxMobileBanking);

        boxEmailAlerts = new JCheckBox("Email Alerts");
        boxEmailAlerts.setFont(new Font("Raleway",Font.BOLD,16));
        boxEmailAlerts.setBounds(510,470,300,30);
        boxEmailAlerts.setBackground(new Color(213,255,255));
        add(boxEmailAlerts);

        boxChequeBook = new JCheckBox("Cheque Book");
        boxChequeBook.setFont(new Font("Raleway",Font.BOLD,16));
        boxChequeBook.setBounds(200,520,300,30);
        boxChequeBook.setBackground(new Color(213,255,255));
        add(boxChequeBook);


        boxStatement = new JCheckBox("E-Statement");
        boxStatement.setFont(new Font("Raleway",Font.BOLD,16));
        boxStatement.setBounds(510,520,300,30);
        boxStatement.setBackground(new Color(213,255,255));
        add(boxStatement);

        JCheckBox boxDeclaration = new JCheckBox("I hereby declares that the information given by me is correct and on any misinformation i will be responsible .",true);
        boxDeclaration.setBackground(new Color(213,255,255));
        boxDeclaration.setFont(new Font("Raleway",Font.BOLD,12));
        boxDeclaration.setBounds(100,580,800,30);
        add(boxDeclaration) ;

        JLabel labelFormNo = new JLabel("Form No : "+formno);
        labelFormNo.setFont(new Font("Raleway",Font.BOLD,18));
        labelFormNo.setBounds(580,10,200,30);
        add(labelFormNo);


        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,16));
        cancel.setBounds(100,620,200,30);
        cancel.setBackground(Color.DARK_GRAY);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);


        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,16));
        submit.setBounds(510,620,200,30);
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);











        setLayout(null);
        setSize(850,800);
        setLocation(225,0);
        getContentPane().setBackground(new Color(213,255,255));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acc_type = null ;
        if (buttonSaving.isSelected()){
            acc_type = "Saving Account" ;
        } else if (buttonCurrent.isSelected()) {
            acc_type = "Current Account";
        } else if (buttonDep.isSelected()) {
            acc_type = "Recurring Deposit Account";
        } else if (buttonFixedDep.isSelected()) {
            acc_type = "Fixed Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong()% 90000000L) + 1409963000000000L;
        String card_no = "" + Math.abs(first7) ;

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin_no = ""+ Math.abs(first3);

        String facility = getFacility();

        try {
            if (e.getSource() == submit){
            if (acc_type.equals("")){
                JOptionPane.showMessageDialog(null,"Please select account type !");
            }else {
                Conn c1 = new Conn();
                String q1 = "insert into signUp3 values('" + formno + "','" + acc_type + "','" + card_no + "','" + pin_no + "','" + facility + "')";
                String q2 = "insert into login values('" + formno + "','" + card_no + "','" + pin_no + "')";
                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Card No : " + card_no + "\nPIN No : " + pin_no);
                new Deposit(pin_no) ;
                setVisible(false);
            }
            } else if (e.getSource() == cancel) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    private String getFacility() {
        String facility = "";

        if (boxATMCard.isSelected()){
            facility += "ATM Card";
        }if (boxNetBanking.isSelected()) {
            facility += " Internet Banking" ;
        }if (boxMobileBanking.isSelected()) {
            facility += " Mobile Banking" ;
        }if (boxEmailAlerts.isSelected()) {
            facility += " Email Alerts" ;
        }if (boxChequeBook.isSelected()) {
            facility += " Cheque Book" ;
        }if (boxStatement.isSelected()) {
            facility += " E-Statement" ;
        }
        return facility;
    }

    public static void main(String[] args) {

        new signUp3("");

    }
}
