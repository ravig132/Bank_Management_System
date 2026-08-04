package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUp2 extends JFrame implements ActionListener {

    JButton next ;

    JTextField textPanNo,textAadhaarNo;

    JComboBox comboBox ,comboBox2 , comboBox3 , comboBox4 ,comboBox5;

    JRadioButton buttonYes ,buttonNo ,existingYes,existingNo ;


    String formno ;
    signUp2(String first){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BANKR.png"));
        Image i2 = i1.getImage().getScaledInstance(200,84,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,200,84);
        add(image);


        this.formno = first ;

        JLabel label1 = new JLabel("Page 2");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(375,10,600,30);
        add(label1);

        JLabel label2 = new JLabel("Additional Details");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(325,60,600,40);
        add(label2);

        JLabel labelReligion = new JLabel("Religion : ");
        labelReligion.setFont(new Font("Raleway",Font.BOLD,20));
        labelReligion.setBounds(10,120,200,30);
        add(labelReligion);

        String religion[] = {"Hinduism", "Muslim", "Sikh", "Christian", "Other"};

        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(213,255,255));
        comboBox.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox.setBounds(300,125,400,30);
        add(comboBox);

        JLabel  labelCategory = new JLabel("Category : ");
        labelCategory.setFont(new Font("Raleway",Font.BOLD,20));
        labelCategory.setBounds(10,160,200,30);
        add(labelCategory);

        String category[] = {"General","EWS","OBC","SC","ST","Other"};

        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(213,255,255));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox2.setBounds(300,165,400,30);
        add(comboBox2);

        JLabel labelIncome = new JLabel("Income : ");
        labelIncome.setFont(new Font("Raleway",Font.BOLD,20));
        labelIncome.setBounds(10,200,200,30);
        add(labelIncome);


        String income [] = {"Null","< 1.5 Lakh ","< 2.5 Lakh","Upto 5 Lakh","Upto 10 Lakh","Above 10 Lakh"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(213,255,255));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox3.setBounds(300,205,400,30);
        add(comboBox3);

        JLabel labelEducation = new JLabel("Highest Qualification : ");
        labelEducation.setFont(new Font("Raleway",Font.BOLD,20));
        labelEducation.setBounds(10,240,300,30);
        add(labelEducation);


        String education[] = {"High School","Intermediate","Graduate","Post Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(213,255,255));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox4.setBounds(300,245,400,30);
        add(comboBox4);

        JLabel labelOccupation = new JLabel("Occupation : ");
        labelOccupation.setFont(new Font("Raleway",Font.BOLD,20));
        labelOccupation.setBounds(10,280,300,30);
        add(labelOccupation);


        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(213,255,255));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox5.setBounds(300,285,400,30);
        add(comboBox5);

        JLabel labelPanNo = new JLabel("PAN No : ");
        labelPanNo.setFont(new Font("Raleway",Font.BOLD,20));
        labelPanNo.setBounds(10,320,200,30);
        add(labelPanNo);

        textPanNo = new JTextField();
        textPanNo.setFont(new Font("Raleway",Font.BOLD,16));
        textPanNo.setBackground(new Color(213,255,255));
        textPanNo.setBounds(300,325,400,30);
        add(textPanNo);


        JLabel labelAadhaar = new JLabel("Aadhaar No : ");
        labelAadhaar.setFont(new Font("Raleway",Font.BOLD,20));
        labelAadhaar.setBounds(10,360,200,30);
        add(labelAadhaar);

        textAadhaarNo = new JTextField();
        textAadhaarNo.setBackground(new Color(213,255,255));
        textAadhaarNo.setFont(new Font("Raleway",Font.BOLD,16));
        textAadhaarNo.setBounds(300,365,400,30);
        add(textAadhaarNo);

        JLabel labelSeniorCitizen = new JLabel("Senior Citizen : ");
        labelSeniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        labelSeniorCitizen.setBounds(10,400,200,30);
        add(labelSeniorCitizen);


        buttonYes = new JRadioButton("Yes");
        buttonYes.setBackground(new Color(213,255,255));
        buttonYes.setFont(new Font("Raleway",Font.BOLD,16));
        buttonYes.setBounds(300,405,200,30);
        add(buttonYes);

        buttonNo = new JRadioButton("No");
        buttonNo.setBackground(new Color(213,255,255));
        buttonNo.setFont(new Font("Raleway",Font.BOLD,16));
        buttonNo.setBounds(500,405,200,30);
        add(buttonNo);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(buttonYes);
        group1.add(buttonNo);


        JLabel labelExistingAcc = new JLabel("Existing Account : ");
        labelExistingAcc.setFont(new Font("Raleway",Font.BOLD,20));
        labelExistingAcc.setBounds(10,440,300,30);
        add(labelExistingAcc);


        existingYes = new JRadioButton("Yes");
        existingYes.setBackground(new Color(213,255,255));
        existingYes.setFont(new Font("Raleway",Font.BOLD,16));
        existingYes.setBounds(300,445,200,30);
        add(existingYes);

        existingNo = new JRadioButton("No");
        existingNo .setBackground(new Color(213,255,255));
        existingNo .setFont(new Font("Raleway",Font.BOLD,16));
        existingNo .setBounds(500,445,200,30);
        add(existingNo );

        ButtonGroup group2 = new ButtonGroup();
        group2.add(existingYes );
        group2.add(existingNo );

        JLabel labelFormNo = new JLabel("Form No : "+formno);
        labelFormNo.setFont(new Font("Raleway",Font.BOLD,18));
        labelFormNo.setBounds(580,10,200,30);
        add(labelFormNo);



        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setBounds(620,600,80,30);
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(850,750);
        setLocation(225,0);
        getContentPane().setBackground(new Color(213,255,255));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion = (String) comboBox.getSelectedItem();
        String category = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();
        String pan_no = textPanNo.getText();
        String aadhaar_no = textAadhaarNo.getText();
        String senior_citizen = null ;
        if (buttonYes.isSelected()){
            senior_citizen = "Yes" ;
        }else if(buttonNo.isSelected()){
            senior_citizen = "No";
        }

        String existing_acc = null;
        if (existingYes.isSelected()){
            existing_acc = "Yes" ;
        } else if (existingNo.isSelected()) {
            existing_acc = "No" ;
        }


        try {

            if (textPanNo.getText().equals(" ") || textAadhaarNo.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Fill all the fields.");
            }else {
                Conn c1 = new Conn();
                String q = "insert into signUp2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan_no+"','"+aadhaar_no+"','"+senior_citizen+"','"+existing_acc+"')";
                c1.statement.executeUpdate(q);
                new signUp3(formno);
                setVisible(false);

            }



        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signUp2("") ;
    }
}
