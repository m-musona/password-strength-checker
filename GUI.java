import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends Frame {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private Panel labelPanel;
    private PasswordChecker passwordChecker;

    public GUI(PasswordChecker pchecker) {
        passwordChecker = pchecker;

        // Set up the frame properties
        setTitle("Password Strength Checker");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLayout(null); // Using null layout for manual positioning

        // Create a panel to hold the labels
        labelPanel = new Panel();
        labelPanel.setLayout(null); // Using null layout for manual positioning within the panel
        labelPanel.setBounds(40, 120, FRAME_WIDTH - 20, FRAME_HEIGHT - 50);

        // Create a TextField (text box)
        TextField textField = new TextField();
        textField.setBounds(50, 50, 200, 25);
        
        // Create a Button
        Button button = new Button("Submit Password");
        button.setBounds(100, 90, 110, 30);
        
        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Print the text from the text field when the button is clicked
                passwordChecker.CheckForErrors(textField.getText());
                updateLabels();
            }
        });

        add(labelPanel);
        add(button);
        add(textField);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0); // Exit the application
            }
        });
    }

    private void updateLabels() {
        // Remove existing labels
        labelPanel.removeAll();
        int y = 0;
        
        if (passwordChecker.GetErrors().isEmpty())
        {
            Label label = new Label("Is A Valid Password");
            label.setBounds(10, y, labelPanel.getWidth() - 20, 30);
            Color labelColor = new Color(0, 255, 0);
            label.setForeground(labelColor);
            labelPanel.add(label);
        }
        else
        {
            // Create new labels based on the current list of strings
            for (String text : passwordChecker.GetErrors()) {
                Label label = new Label(text);
                label.setBounds(10, y, labelPanel.getWidth() - 20, 30);
                Color labelColor = new Color(255, 0, 0);
                label.setForeground(labelColor);
                labelPanel.add(label);
                y += 40; // Adjust the y-coordinate for the next label
            }
        }
        
        // Revalidate and repaint the panel to reflect changes
        labelPanel.revalidate();
        labelPanel.repaint();
    }
}
