import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Twitter");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 400);

        JPanel panel = new JPanel();

        panel.setLayout(null);


        JLabel emailOutput = new JLabel("jhasfb");
        emailOutput.setBounds(30, 10, 100, 10);
        panel.add(emailOutput);

        // email label
        JLabel email = new JLabel("Email");
        email.setBounds(30, 30, 100, 10);
        panel.add(email);

        // email text field
        JTextField emailInput = new JTextField();
        emailInput.setBounds(30, 50, 200, 30);
        panel.add(emailInput);


        // password label
        JLabel password = new JLabel("Password");
        password.setBounds(30, 90, 100, 10);
        panel.add(password);

        // password text field
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(30, 110, 200, 30);
        panel.add(passwordInput);

        // button
        JButton register = new JButton("Register");
        register.setBounds(30, 160, 200, 40);
        panel.add(register);


        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                emailOutput.setText(emailInput.getText());
            }
        });





        frame.add(panel);


        frame.setVisible(true);

    }
}