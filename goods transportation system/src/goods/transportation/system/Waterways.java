package goods.transportation.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.Random;

public class Waterways extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
    JButton button, backButton;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String applicationNo = "" + Math.abs(first4);

    Waterways() {
        setTitle("GTS-Waterways");

        label1 = new JLabel("APPLICATION NO. " + applicationNo);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));

        label2 = new JLabel("Name:");
        label2.setFont(new Font("Raleway", Font.BOLD, 20));

        label3 = new JLabel("Mobile No:");
        label3.setFont(new Font("Raleway", Font.BOLD, 20));

        label4 = new JLabel("Date:");
        label4.setFont(new Font("Raleway", Font.BOLD, 20));

        label5 = new JLabel("Email:");
        label5.setFont(new Font("Raleway", Font.BOLD, 20));

        label6 = new JLabel("Cargo Weight:");
        label6.setFont(new Font("Raleway", Font.BOLD, 20));

        label7 = new JLabel("Source Address:");
        label7.setFont(new Font("Raleway", Font.BOLD, 20));

        label8 = new JLabel("Pincode:");
        label8.setFont(new Font("Raleway", Font.BOLD, 20));

        label9 = new JLabel("Destination Address:");
        label9.setFont(new Font("Raleway", Font.BOLD, 20));

        label10 = new JLabel("Pincode:");
        label10.setFont(new Font("Raleway", Font.BOLD, 20));

        textField1 = new JTextField();
        textField1.setFont(new Font("Raleway", Font.BOLD, 14));

        textField2 = new JTextField();
        textField2.setFont(new Font("Raleway", Font.BOLD, 14));

        textField3 = new JTextField();
        textField3.setFont(new Font("Raleway", Font.BOLD, 14));

        textField4 = new JTextField();
        textField4.setFont(new Font("Raleway", Font.BOLD, 14));

        textField5 = new JTextField();
        textField5.setFont(new Font("Raleway", Font.BOLD, 14));

        textField6 = new JTextField();
        textField6.setFont(new Font("Raleway", Font.BOLD, 14));

        textField7 = new JTextField();
        textField7.setFont(new Font("Raleway", Font.BOLD, 14));

        textField8 = new JTextField();
        textField8.setFont(new Font("Raleway", Font.BOLD, 14));

        button = new JButton("Submit");
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 200, 30);

        setLayout(null);
        label1.setBounds(140, 20, 600, 40);
        add(label1);

        label2.setBounds(100, 140, 100, 30);
        add(label2);

        textField1.setBounds(300, 140, 400, 30);
        add(textField1);

        label3.setBounds(100, 190, 200, 30);
        add(label3);

        textField2.setBounds(300, 190, 400, 30);
        add(textField2);

        label4.setBounds(100, 240, 200, 30);
        add(label4);

        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);

        label5.setBounds(100, 290, 200, 30);
        add(label5);

        textField3.setBounds(300, 290, 400, 30);
        add(textField3);

        label6.setBounds(100, 340, 200, 30);
        add(label6);

        textField4.setBounds(300, 340, 400, 30);
        add(textField4);

        label7.setBounds(100, 390, 200, 30);
        add(label7);

        textField5.setBounds(300, 390, 400, 30);
        add(textField5);

        label8.setBounds(100, 440, 200, 30);
        add(label8);

        textField6.setBounds(300, 440, 400, 30);
        add(textField6);

        label9.setBounds(100, 490, 200, 30);
        add(label9);

        textField7.setBounds(300, 490, 400, 30);
        add(textField7);

        label10.setBounds(100, 540, 200, 30);
        add(label10);

        textField8.setBounds(300, 540, 400, 30);
        add(textField8);

        button.setBounds(620, 660, 150, 30);
        add(button);

        button.addActionListener(this);

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
        if (ae.getSource() == button) {
            String formno = applicationNo;
            String name = textField1.getText();
            String mobno = textField2.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String email = textField3.getText();
            String cargoWeight = textField4.getText();
            String saddress = textField5.getText();
            String spin = textField6.getText();
            String daddress = textField7.getText();
            String dpin = textField8.getText();

            try {
                if (daddress.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Conn c = new Conn();
                    String q4 = "insert into waterways values('" + formno + "','" + name + "','" + mobno + "','" + dob + "','" + email + "','" + cargoWeight + "','" + saddress + "','" + spin + "','" + daddress + "','" + dpin + "')";
                    c.s.executeUpdate(q4);
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
        new Waterways().setVisible(true);
    }
}
