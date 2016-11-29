
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Snake2Panel extends JPanel{
    JLabel snake2Label;
    private JTextField snake2Name;
    JLabel snake2ColorLabel;
    private JButton greenSnake;
    private JButton blueSnake;
    private JButton purpleSnake;
    
    Snake2Panel() {
             GridLayout border = new GridLayout(6, 1);
        this.setLayout(border);
        snake2Label = new JLabel("Snake 2's Settings");
        snake2Name = new JTextField("Snake 2's Name");
        snake2ColorLabel = new JLabel("Snake 2's Color:");
        greenSnake = new JButton("Green");
        blueSnake = new JButton("Blue");
        purpleSnake = new JButton("Purple");
        
        add(snake2Label);
        snake2Label.setHorizontalAlignment(JLabel.CENTER);
        add(snake2Name);
        add(greenSnake);
        add(blueSnake);
        add(purpleSnake);
    }
    
    public JButton getGreenSnakeButton() {
        return greenSnake;
    }
    
    public JButton getBlueSnakeButton() {
        return blueSnake;
    }
    
    public JButton getPurpleSnakeButton() {
        return purpleSnake;
    }
    
    public String getSnake2Name() {
        return snake2Name.getText();
    }
    
}
