import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GenOptPanel extends JPanel
{
    JLabel genSettingsLabel;
    JButton whiteButton;
    JButton blackButton;
    JButton grayButton;
    JButton saveSettings;
    JButton cancelButton;
    
    GenOptPanel()
    {
        GridLayout border = new GridLayout(6, 1);
        this.setLayout(border);
        genSettingsLabel = new JLabel("General Settings");
        whiteButton = new JButton("White background");
        blackButton = new JButton("Black background");
        grayButton = new JButton("Gray background");
        saveSettings = new JButton("Save");
        cancelButton = new JButton("Cancel");
        
        add(genSettingsLabel);
        genSettingsLabel.setHorizontalAlignment(JLabel.CENTER);
        add(whiteButton);
        add(blackButton);
        add(grayButton);
        add(saveSettings);
        add(cancelButton);
    }
    
    public JButton getWhiteBackgroundButton() {
        return whiteButton;
    }
    
    public JButton getBlackBackgroundButton() {
        return blackButton;
    }
    
    public JButton getGrayBackgroundButton() {
        return grayButton;
    }
    
    public JButton getSaveButton() {
        return saveSettings;
    }
    
    public JButton getCancelButton() {
        return cancelButton;
    }
    
    
}
