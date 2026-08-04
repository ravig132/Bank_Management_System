package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class signUp extends JFrame implements ActionListener {

    JTextField textName, textFName, textEmail, textAddress, textCity, textState, textPinCode;
    JRadioButton radioButtonMale, radioButtonFemale, radioButtonOther, radioButtonMarried, radioButtonUnmarried;
    JDateChooser dateChooser;
    JButton buttonNext;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    // int first1 = (int) Math.ceil(Math.random()*1000);
    // Integer first = first1 ;

    signUp() {

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 84, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 200, 84);
        add(image);

        JLabel label1 = new JLabel("Application Form No : " + first);
        label1.setBounds(10, 75, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(375, 10, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(10, 120, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(10, 160, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 16));
        textName.setBounds(300, 165, 400, 30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name : ");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(10, 200, 200, 30);
        add(labelFName);

        textFName = new JTextField("Mr. ");
        textFName.setFont(new Font("Raleway", Font.BOLD, 16));
        textFName.setBounds(300, 205, 400, 30);
        add(textFName);

        JLabel DOB = new JLabel("Date Of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(10, 240, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 245, 400, 30);
        add(dateChooser);

        JLabel labelGender = new JLabel("Gender : ");
        labelGender.setFont(new Font("Raleway", Font.BOLD, 20));
        labelGender.setBounds(10, 280, 200, 30);
        add(labelGender);

        radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButtonMale.setBackground(new Color(213, 255, 255));
        radioButtonMale.setBounds(300, 285, 100, 30);
        add(radioButtonMale);

        radioButtonFemale = new JRadioButton("Female");
        radioButtonFemale.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButtonFemale.setBackground(new Color(213, 255, 255));
        radioButtonFemale.setBounds(450, 285, 100, 30);
        add(radioButtonFemale);

        radioButtonOther = new JRadioButton("Other");
        radioButtonOther.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButtonOther.setBackground(new Color(213, 255, 255));
        radioButtonOther.setBounds(600, 285, 100, 30);
        add(radioButtonOther);

        ButtonGroup group1 = new ButtonGroup();

        group1.add(radioButtonMale);
        group1.add(radioButtonFemale);
        group1.add(radioButtonOther);

        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(10, 320, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 16));
        textEmail.setBounds(300, 325, 400, 30);
        add(textEmail);

        JLabel labelMaritalStatus = new JLabel("Marital Status : ");
        labelMaritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMaritalStatus.setBounds(10, 360, 200, 30);
        add(labelMaritalStatus);

        radioButtonMarried = new JRadioButton("Married");
        radioButtonMarried.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButtonMarried.setBackground(new Color(213, 255, 255));
        radioButtonMarried.setBounds(300, 365, 100, 30);
        add(radioButtonMarried);

        radioButtonUnmarried = new JRadioButton("Unmarried");
        radioButtonUnmarried.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButtonUnmarried.setBackground(new Color(213, 255, 255));
        radioButtonUnmarried.setBounds(450, 365, 150, 30);
        add(radioButtonUnmarried);

        radioButtonOther = new JRadioButton("Other");
        radioButtonOther.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButtonOther.setBackground(new Color(213, 255, 255));
        radioButtonOther.setBounds(600, 365, 100, 30);
        add(radioButtonOther);

        ButtonGroup group2 = new ButtonGroup();

        group2.add(radioButtonMarried);
        group2.add(radioButtonUnmarried);
        group2.add(radioButtonOther);

        JLabel labelAddress = new JLabel("Address : ");
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAddress.setBounds(10, 400, 200, 30);
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 16));
        textAddress.setBounds(300, 405, 400, 30);
        add(textAddress);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(10, 440, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 16));
        textCity.setBounds(300, 445, 400, 30);
        add(textCity);

        JLabel labelPinCode = new JLabel("Pin Code : ");
        labelPinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPinCode.setBounds(10, 480, 200, 30);
        add(labelPinCode);

        textPinCode = new JTextField();
        textPinCode.setFont(new Font("Raleway", Font.BOLD, 16));
        textPinCode.setBounds(300, 485, 400, 30);
        add(textPinCode);

        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(10, 520, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 16));
        textState.setBounds(300, 525, 400, 30);
        add(textState);

        buttonNext = new JButton("Next");
        buttonNext.setFont(new Font("Raleway", Font.BOLD, 16));
        buttonNext.setBackground(Color.DARK_GRAY);
        buttonNext.setForeground(Color.WHITE);
        buttonNext.setBounds(620, 600, 80, 30);
        buttonNext.addActionListener(this);
        add(buttonNext);

        getContentPane().setBackground(new Color(213, 255, 255));
        setLayout(null);
        setSize(850, 800);
        setLocation(225, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (radioButtonMale.isSelected()) {
            gender = "Male";
        } else if (radioButtonFemale.isSelected()) {
            gender = "Female";
        } else if (radioButtonOther.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String maritalStatus = null;
        if (radioButtonMarried.isSelected()) {
            maritalStatus = "Married";
        } else if (radioButtonUnmarried.isSelected()) {
            maritalStatus = "Unmarried";
        } else if (radioButtonOther.isSelected()) {
            maritalStatus = "Other";
        }

        String address = textAddress.getText();
        String city = textCity.getText();
        String pinCode = textPinCode.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            } else {
                Conn con1 = new Conn();
                String q = "Insert Into signUp values('" + formNo + "','" + name + "','" + fname + "','" + dob + "','"
                        + gender + "','" + email + "','" + maritalStatus + "','" + address + "','" + city + "','"
                        + pinCode + "','" + state + "')";
                con1.statement.executeUpdate(q);
                new signUp2(first);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signUp();
    }

}
