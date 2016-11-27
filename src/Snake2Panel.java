
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Snake2Panel extends JPanel{
    JLabel snake2Label;
    JTextField snake2Name;
    JLabel snake2ColorLabel;
    JButton greenSnake;
    JButton blueSnake;
    JButton purpleSnake;
    
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
        add(snake2Name);
        add(greenSnake);
        add(blueSnake);
        add(purpleSnake);
    }
}
