package goods.transportation.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.Random;

public class Airways extends JFrame implements ActionListener {

    JLabel airwaysLabel1, airwaysLabel2, airwaysLabel3, airwaysLabel4, airwaysLabel5, airwaysLabel6, airwaysLabel7, airwaysLabel8, airwaysLabel9, airwaysLabel10, airwaysLabel11;
    JTextField airwaysTextField1, airwaysTextField2, airwaysTextField3, airwaysTextField4, airwaysTextField5, airwaysTextField6, airwaysTextField7;
    JRadioButton airwaysRadio1, airwaysRadio2, airwaysRadio3, airwaysRadio4, airwaysRadio5;
    JButton airwaysButton, backButton;
    JDateChooser airwaysDateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String airwaysApplicationNo = "" + Math.abs(first4);

    Airways() {
        setTitle("GTS-Airways");

        airwaysLabel1 = new JLabel("APPLICATION NO. " + airwaysApplicationNo);
        airwaysLabel1.setFont(new Font("Raleway", Font.BOLD, 38));

        airwaysLabel2 = new JLabel("Name:");
        airwaysLabel2.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel3 = new JLabel("Mobile No:");
        airwaysLabel3.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel4 = new JLabel("Date:");
        airwaysLabel4.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel5 = new JLabel("Transport Type:");
        airwaysLabel5.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel6 = new JLabel("Email:");
        airwaysLabel6.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel7 = new JLabel("Cargo Weight:");
        airwaysLabel7.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel8 = new JLabel("Source Address:");
        airwaysLabel8.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel9 = new JLabel("Pincode:");
        airwaysLabel9.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel10 = new JLabel("Destination Address:");
        airwaysLabel10.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysLabel11 = new JLabel("Pincode:");
        airwaysLabel11.setFont(new Font("Raleway", Font.BOLD, 20));

        airwaysTextField1 = new JTextField();
        airwaysTextField1.setFont(new Font("Raleway", Font.BOLD, 14));

        airwaysTextField2 = new JTextField();
        airwaysTextField2.setFont(new Font("Raleway", Font.BOLD, 14));

        airwaysTextField3 = new JTextField();
        airwaysTextField3.setFont(new Font("Raleway", Font.BOLD, 14));

        airwaysTextField4 = new JTextField();
        airwaysTextField4.setFont(new Font("Raleway", Font.BOLD, 14));

        airwaysTextField5 = new JTextField();
        airwaysTextField5.setFont(new Font("Raleway", Font.BOLD, 14));

        airwaysTextField6 = new JTextField();
        airwaysTextField6.setFont(new Font("Raleway", Font.BOLD, 14));

        airwaysTextField7 = new JTextField();
        airwaysTextField7.setFont(new Font("Raleway", Font.BOLD, 14));

        airwaysButton = new JButton("Submit");
        airwaysButton.setFont(new Font("Raleway", Font.BOLD, 14));
        airwaysButton.setBackground(Color.BLACK);
        airwaysButton.setForeground(Color.WHITE);

        airwaysRadio1 = new JRadioButton("Passenger Aircraft");
        airwaysRadio1.setFont(new Font("Raleway", Font.BOLD, 14));
        airwaysRadio1.setBackground(Color.WHITE);

        airwaysRadio2 = new JRadioButton("Cargo Aircraft");
        airwaysRadio2.setFont(new Font("Raleway", Font.BOLD, 14));
        airwaysRadio2.setBackground(Color.WHITE);

        ButtonGroup transportTypeGroup = new ButtonGroup();
        transportTypeGroup.add(airwaysRadio1);
        transportTypeGroup.add(airwaysRadio2);

        airwaysRadio3 = new JRadioButton("10-20 kg");
        airwaysRadio3.setFont(new Font("Raleway", Font.BOLD, 14));
        airwaysRadio3.setBackground(Color.WHITE);

        airwaysRadio4 = new JRadioButton("30-40 kg");
        airwaysRadio4.setFont(new Font("Raleway", Font.BOLD, 14));
        airwaysRadio4.setBackground(Color.WHITE);

        airwaysRadio5 = new JRadioButton("50-60 kg");
        airwaysRadio5.setFont(new Font("Raleway", Font.BOLD, 14));
        airwaysRadio5.setBackground(Color.WHITE);

        ButtonGroup cargoWeightGroup = new ButtonGroup();
        cargoWeightGroup.add(airwaysRadio3);
        cargoWeightGroup.add(airwaysRadio4);
        cargoWeightGroup.add(airwaysRadio5);

        airwaysDateChooser = new JDateChooser();
	airwaysDateChooser.setForeground(new Color(105, 105, 105));
	airwaysDateChooser.setBounds(137, 337, 200, 29);
	add(airwaysDateChooser);
        
        airwaysDateChooser.setBounds(300, 240, 400, 30);

        setLayout(null);
        airwaysLabel1.setBounds(140, 20, 600, 40);
        add(airwaysLabel1);

        airwaysLabel2.setBounds(100, 140, 100, 30);
        add(airwaysLabel2);

        airwaysTextField1.setBounds(300, 140, 400, 30);
        add(airwaysTextField1);

        airwaysLabel3.setBounds(100, 190, 200, 30);
        add(airwaysLabel3);

        airwaysTextField2.setBounds(300, 190, 400, 30);
        add(airwaysTextField2);

        airwaysLabel4.setBounds(100, 240, 200, 30);
        add(airwaysLabel4);

        

        airwaysLabel5.setBounds(100, 290, 200, 30);
        add(airwaysLabel5);

        airwaysRadio1.setBounds(300, 290, 200, 30);
        add(airwaysRadio1);

        airwaysRadio2.setBounds(550, 290, 150, 30);
        add(airwaysRadio2);

        airwaysLabel6.setBounds(100, 340, 200, 30);
        add(airwaysLabel6);

        airwaysTextField3.setBounds(300, 340, 400, 30);
        add(airwaysTextField3);

        airwaysLabel7.setBounds(100, 390, 200, 30);
        add(airwaysLabel7);

        airwaysRadio3.setBounds(300, 390, 100, 30);
        add(airwaysRadio3);

        airwaysRadio4.setBounds(450, 390, 100, 30);
        add(airwaysRadio4);

        airwaysRadio5.setBounds(635, 390, 100, 30);
        add(airwaysRadio5);

        airwaysLabel8.setBounds(100, 440, 200, 30);
        add(airwaysLabel8);

        airwaysTextField4.setBounds(300, 440, 400, 30);
        add(airwaysTextField4);

        airwaysLabel9.setBounds(100, 490, 200, 30);
        add(airwaysLabel9);

        airwaysTextField5.setBounds(300, 490, 400, 30);
        add(airwaysTextField5);

        airwaysLabel10.setBounds(100, 540, 200, 30);
        add(airwaysLabel10);

        airwaysTextField6.setBounds(300, 540, 400, 30);
        add(airwaysTextField6);

        airwaysLabel11.setBounds(100, 590, 200, 30);
        add(airwaysLabel11);

        airwaysTextField7.setBounds(300, 590, 400, 30);
        add(airwaysTextField7);

        airwaysButton.setBounds(620, 660, 150, 30);
        add(airwaysButton);

        airwaysButton.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(500, 120);
        setVisible(true);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Raleway", Font.BOLD, 14));
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(300, 660, 150, 30);
        add(backButton);

        backButton.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(500, 120);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == airwaysButton) {
            String formno = airwaysApplicationNo;
            String name = airwaysTextField1.getText();
            String mobno = airwaysTextField2.getText();
            String dob = ((JTextField) airwaysDateChooser.getDateEditor().getUiComponent()).getText();
            String vehicle = null;
            if (airwaysRadio1.isSelected()) {
                vehicle = "Passenger Aircraft";
            } else if (airwaysRadio2.isSelected()) {
                vehicle = "Cargo Aircraft";
            }

            String email = airwaysTextField3.getText();
            String cargoWeight = null;
            if (airwaysRadio3.isSelected()) {
                cargoWeight = "10-20 kg";
            } else if (airwaysRadio4.isSelected()) {
                cargoWeight = "30-40 kg";
            } else if (airwaysRadio5.isSelected()) {
                cargoWeight = "50-60 kg";
            }

            String saddress = airwaysTextField4.getText();
            String spin = airwaysTextField5.getText();
            String daddress = airwaysTextField6.getText();
            String dpin = airwaysTextField7.getText();

            try {
                if (daddress.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Conn c = new Conn();
                    String q2 = "insert into airways values('" + formno + "','" + name + "','" + mobno + "','" + dob + "','" + vehicle + "','" + email + "','" + cargoWeight + "','" + saddress + "','" + spin + "','" + daddress + "','" + dpin + "')";
                    c.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Your Application has been Submitted Successfully");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == backButton) {
            dispose();
            new HomePage().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Airways().setVisible(true);
    }
}
