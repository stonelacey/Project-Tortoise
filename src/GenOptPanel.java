
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GenOptPanel extends JPanel {
    JLabel genSettingsLabel;
    JButton whiteButton;
    JButton blackButton;
    JButton grayButton;
    JButton saveSettings;
    JButton cancelButton;
    
    GenOptPanel() {
             GridLayout border = new GridLayout(2,3);
        this.setLayout(border);
        genSettingsLabel = new JLabel("General Settings");
        whiteButton = new JButton("White");
        blackButton = new JButton("Black");
        grayButton = new JButton("Gray");
        saveSettings = new JButton("Save");
        cancelButton = new JButton("Cancel");
        
        add(genSettingsLabel);
        add(whiteButton);
        add(blackButton);
        add(grayButton);
        add(saveSettings);
        add(cancelButton);
    }
}
