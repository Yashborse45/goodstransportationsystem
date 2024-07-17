package goods.transportation.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {
    
    JButton nextButton;
    JButton backButton; 
    JTextField nameTextField;
    JTextField emailTextField;
    JPasswordField passwordTextField;

    SignUp() {
        setTitle("Goods Transportation System - Sign Up");
        setLayout(null);
        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        nameLabel.setBounds(120, 100, 150, 30);
        add(nameLabel);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300, 100, 250, 30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);
        
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        emailLabel.setBounds(120, 150, 150, 30);
        add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setBounds(300, 150, 250, 30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Osward", Font.BOLD, 28));
        passwordLabel.setBounds(120, 220, 150, 30);
        add(passwordLabel);

        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(300, 220, 250, 30);
        passwordTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordTextField);

        nextButton = new JButton("Next");
        nextButton.setBounds(450, 300, 100, 30);
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        add(nextButton);

        backButton = new JButton("Back");
        backButton.setBounds(300, 300, 100, 30); 
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);
        add(backButton);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == nextButton) {
            String Name = nameTextField.getText();
            String emailLabel = emailTextField.getText();
            String passwordLabel = new String(passwordTextField.getPassword());
            try {
                if (Name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Name is required");
                } else if (emailLabel.equals("")) {
                    JOptionPane.showMessageDialog(null, "Email is required");
                } else if (passwordLabel.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password is required");
                } else {
                    Conn c = new Conn();
                    
                    String query = "insert into signup values('" + emailLabel + "','" + passwordLabel+ "','" + Name + "')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Done!!!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == backButton) {
            new Login();
            dispose();
        }
    }

    public static void main(String args[]) {
        new SignUp();
    }
}
