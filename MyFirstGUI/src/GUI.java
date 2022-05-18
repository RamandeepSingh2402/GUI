import javax.swing.*;

public class GUI {
    public static void main(String[] args) {

        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel();
        userLabel.setText("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,60,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,60,165,25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(80,110,80,25);
        panel.add(button);

        frame.setVisible(true);
    }
}
