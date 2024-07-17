package goods.transportation.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener {
    JButton roadwaysButton;
    JButton airwaysButton;
    JButton waterwaysButton; 
    JButton railwaysButton;  
    JButton logoutButton;

    HomePage() {
        setTitle("Goods Transportation System - Home");
        setLayout(null);

        JLabel text = new JLabel(" Welcome to Goods Transportation System");
        text.setFont(new Font("Osward", Font.BOLD, 26));
        text.setBounds(190, 30, 600, 40);
        add(text);

        JLabel text1 = new JLabel("==> Select the Mode of Transportation");
        text1.setFont(new Font("Raleway", Font.BOLD, 20));
        text1.setBounds(225, 140, 600, 40);
        add(text1);

        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("icons/mot.jpg"));
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(-8, -18, 800, 480);

        add(backgroundLabel);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(50, 50, 100, 30);
        logoutButton.setBackground(Color.WHITE);
        logoutButton.setForeground(Color.BLACK);
        logoutButton.addActionListener(this);
        backgroundLabel.add(logoutButton);

        roadwaysButton = new JButton("Roadways");
        roadwaysButton.setBounds(150, 200, 200, 50);
        roadwaysButton.setBackground(Color.WHITE);
        roadwaysButton.setForeground(Color.BLACK);
        roadwaysButton.addActionListener(this);
        backgroundLabel.add(roadwaysButton);

        airwaysButton = new JButton("Airways");
        airwaysButton.setBounds(450, 200, 200, 50);
        airwaysButton.setBackground(Color.WHITE);
        airwaysButton.setForeground(Color.BLACK);
        airwaysButton.addActionListener(this);
        backgroundLabel.add(airwaysButton);

        waterwaysButton = new JButton("Waterways");
        waterwaysButton.setBounds(150, 300, 200, 50);
        waterwaysButton.setBackground(Color.WHITE);
        waterwaysButton.setForeground(Color.BLACK);
        waterwaysButton.addActionListener(this);
        backgroundLabel.add(waterwaysButton);

        railwaysButton = new JButton("Railways");
        railwaysButton.setBounds(450, 300, 200, 50);
        railwaysButton.setBackground(Color.WHITE);
        railwaysButton.setForeground(Color.BLACK);
        railwaysButton.addActionListener(this);
        backgroundLabel.add(railwaysButton);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == roadwaysButton) {
            JOptionPane.showMessageDialog(null, "Roadways button clicked");
            new Roadways().setVisible(true);
            dispose();
        } else if (ae.getSource() == airwaysButton) {
            JOptionPane.showMessageDialog(null, "Airways button clicked");
            new Airways().setVisible(true);
            dispose();
        } else if (ae.getSource() == waterwaysButton) {
            JOptionPane.showMessageDialog(null, "Waterways button clicked");
            new Waterways().setVisible(true);
            dispose();
        } else if (ae.getSource() == railwaysButton) {
            JOptionPane.showMessageDialog(null, "Railways button clicked");
            new Railways().setVisible(true);
            dispose();
        } else if (ae.getSource() == logoutButton) {
            new Login();
            dispose();
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new HomePage());
    }
}
