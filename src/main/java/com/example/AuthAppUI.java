package com.example;

import javax.swing.*;
import java.awt.*;

public class AuthAppUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AuthAppUI().createAndShowUI());
    }

    private void createAndShowUI() {
        // Frame utama
        JFrame frame = new JFrame("Authentication App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setLayout(new GridLayout(1, 2)); // Membagi menjadi dua panel (kiri dan kanan)

        // Panel untuk Sign In
        JPanel signInPanel = createSignInPanel();
        signInPanel.setBackground(new Color(0, 128, 0)); // Warna hijau

        // Panel untuk Sign Up
        JPanel signUpPanel = createSignUpPanel();
        signUpPanel.setBackground(Color.WHITE);

        // Tambahkan kedua panel ke frame
        frame.add(signInPanel);
        frame.add(signUpPanel);

        frame.setLocationRelativeTo(null); // Posisikan di tengah layar
        frame.setVisible(true);
    }

    private JPanel createSignInPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("Welcome Back!");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(title, gbc);

        JLabel message = new JLabel("To keep connected with us please login with your personal info");
        message.setFont(new Font("Arial", Font.PLAIN, 14));
        message.setForeground(Color.WHITE);
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(message, gbc);

        JButton signInButton = new JButton("SIGN IN");
        signInButton.setBackground(Color.WHITE);
        signInButton.setForeground(new Color(0, 128, 0));
        signInButton.setFocusPainted(false);
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(signInButton, gbc);

        return panel;
    }

    private JPanel createSignUpPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("Create Account");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(0, 128, 0));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(title, gbc);

        JTextField nameField = new JTextField(20);
        nameField.setBorder(BorderFactory.createTitledBorder("Name"));
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(nameField, gbc);

        JTextField emailField = new JTextField(20);
        emailField.setBorder(BorderFactory.createTitledBorder("Email"));
        gbc.gridy = 2;
        panel.add(emailField, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
        gbc.gridy = 3;
        panel.add(passwordField, gbc);

        JButton signUpButton = new JButton("SIGN UP");
        signUpButton.setBackground(new Color(0, 128, 0));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setFocusPainted(false);
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(signUpButton, gbc);

        return panel;
    }
}
