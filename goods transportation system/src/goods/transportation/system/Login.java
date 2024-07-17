package goods.transportation.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton loginButton;
    JButton signUpButton;
    JTextField userTextField; 
    JPasswordField passTextField;
    Connection connection;
    Statement statement;

    Login() {
        setTitle("Goods Transportation System");
        setLayout(null);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Goods Transportation System");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 600, 40);
        add(text);


        JLabel username = new JLabel("Username:");
        username.setFont(new Font("Raleway", Font.BOLD, 28));
        username.setBounds(120, 150, 150, 30);
        add(username);

        userTextField = new JTextField();
        userTextField.setBounds(300, 150, 250, 30);
        userTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(userTextField);

        JLabel password = new JLabel("Password:");
        password.setFont(new Font("Osward", Font.BOLD, 28));
        password.setBounds(120, 220, 150, 30);
        add(password);

        passTextField = new JPasswordField();
        passTextField.setBounds(300, 220, 250, 30);
        passTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passTextField);

        loginButton = new JButton("Login");
        loginButton.setBounds(300, 300, 100, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(430, 300, 100, 30);
        signUpButton.setBackground(Color.BLACK);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.addActionListener(this);
        add(signUpButton);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            connection = DriverManager.getConnection("jdbc:mysql:///goodstransportationsystem", "root", "123456");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {
            String enteredUsername = userTextField.getText();
            String enteredPassword = new String(passTextField.getPassword());

            try {
                String query = "SELECT * FROM signup WHERE emailLabel = '" + enteredUsername + "' AND passwordLabel = '" + enteredPassword + "'";
                ResultSet resultSet = statement.executeQuery(query);

                if (resultSet.next()) {
                    
                    new HomePage();
                    dispose(); 
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == signUpButton) {
            
            new SignUp();
            dispose();
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new Login());
    }
}