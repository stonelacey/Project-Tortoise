import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OptionsView extends JPanel{
    private GenOptPanel optionPanel;
    private Snake1Panel snake1Panel;
    private Snake2Panel snake2Panel;
    
    OptionsView() {
        BorderLayout border = new BorderLayout();
        optionPanel = new GenOptPanel();
        snake1Panel = new Snake1Panel();
        snake2Panel = new Snake2Panel();
        
        
        this.setLayout(border);
        add(optionPanel, BorderLayout.CENTER);
        add(snake1Panel, BorderLayout.WEST);
        add(snake2Panel, BorderLayout.EAST);
    }
    
    public void ButtonListener(ActionListener al) {
        snake1Panel.getRedSnakeButton().addActionListener(al);
        snake1Panel.getOrangeSnakeButton().addActionListener(al);
        snake1Panel.getYellowSnakeButton().addActionListener(al);
        snake2Panel.getGreenSnakeButton().addActionListener(al);
        snake2Panel.getBlueSnakeButton().addActionListener(al);
        snake2Panel.getPurpleSnakeButton().addActionListener(al);
        optionPanel.getWhiteBackgroundButton().addActionListener(al);
        optionPanel.getBlackBackgroundButton().addActionListener(al);
        optionPanel.getGrayBackgroundButton().addActionListener(al);
        optionPanel.getSaveButton().addActionListener(al);
        optionPanel.getCancelButton().addActionListener(al);
    }
    
    public JButton getRedSnakeButton() {
        return snake1Panel.getRedSnakeButton();
    }
    
    public JButton getOrangeSnakeButton() {
        return snake1Panel.getOrangeSnakeButton();
    }
    
    public JButton getYellowSnakeButton() {
        return snake1Panel.getYellowSnakeButton();
    }
    
    public JButton getGreenSnakeButton() {
        return snake2Panel.getGreenSnakeButton();
    }
    
    public JButton getBlueSnakeButton() {
        return snake2Panel.getBlueSnakeButton();
    }
    
    public JButton getPurpleSnakeButton() {
        return snake2Panel.getPurpleSnakeButton();
    }
    
    public JButton getWhiteBackgroundButton() {
        return optionPanel.getWhiteBackgroundButton();
    }
    
    public JButton getBlackBackgroundButton() {
        return optionPanel.getBlackBackgroundButton();
    }
    
    public JButton getGrayBackgroundButton() {
        return optionPanel.getGrayBackgroundButton();
    }
    
    public JButton getSaveButton() {
        return optionPanel.getSaveButton();
    }
    
    public JButton getCancelButton() {
        return optionPanel.getCancelButton();
    }
    
    public String getS1Name()
    {
        return snake1Panel.getSnake1Name();
    }
    
    public String getS2Name()
    {
        return snake2Panel.getSnake2Name();
    }
    
}
