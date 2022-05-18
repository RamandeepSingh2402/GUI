import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args) {

        //creating an object panel
        panel = new JPanel();

        //creating a new frame
        frame = new JFrame();

        //setting the size of the frame, defaultCloseOperation and adding the panel to the frame
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        //setting the layout of the panel to be null
        panel.setLayout(null);

        //creating and instantiating a JLabel userLabel, setting its text, bounds and adding it to the panel
        userLabel = new JLabel();
        userLabel.setText("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        //creating and instantiating a JTextField which takes in the username, setting its bounds and adding it to the panel
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        //creating and instantiating a JLabel passwordLabel, setting its text, bounds and adding it to the panel
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,60,80,25);
        panel.add(passwordLabel);

        //creating and instantiating a JPasswordField which takes in password, setting its bounds and adding it to the panel
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,60,165,25);
        panel.add(passwordText);

        //creating and instantiating a JButton, setting its bounds and adding actionListener and adding it to the panel
        button = new JButton("Login");
        button.setBounds(80,110,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        //creating and instantiating a JLabel, setting its bounds and adding it to the panel
        success = new JLabel("");
        success.setBounds(10,140,300,25);
        panel.add(success);

        //setting the visibility of the frame to be true
        frame.setVisible(true);
    }

    //ActionListener which prints whether the login is successful or not
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        if(user.equals("Ramandeep") && password.equals("password234")){
            success.setText("Login successful!");
        }
        else{
            success.setText("Login unsuccessful");
        }
    }
}
