
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Snake1Panel extends JPanel{
    JLabel snake1Label;
    JTextField snake1Name;
    JButton redSnake;
    JButton orangeSnake;
    JButton yellowSnake;
    
    Snake1Panel() {
        snake1Label = new JLabel("Snake 1's Settings");
        snake1Name = new JTextField("Snake 1's Name");
        redSnake = new JButton("Red");
        orangeSnake = new JButton("Orange");
        yellowSnake = new JButton("Yellow");
        
        add(snake1Label);
        add(snake1Name);
        add(redSnake);
        add(orangeSnake);
        add(yellowSnake);
    }
}
