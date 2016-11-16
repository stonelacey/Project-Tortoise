
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Snake2Panel extends JPanel{
    JLabel snake2Label;
    JTextField snake2Name;
    JButton blueSnake;
    JButton purpleSnake;
    JButton greenSnake;
    
    Snake2Panel() {
        snake2Label = new JLabel("Snake 2's Settings");
        snake2Name = new JTextField("Snake 2's Name");
        blueSnake = new JButton("Blue");
        purpleSnake = new JButton("Purple");
        greenSnake = new JButton("Green");
        
        add(snake2Label);
        add(snake2Name);
        add(blueSnake);
        add(purpleSnake);
        add(greenSnake);
    }
}
