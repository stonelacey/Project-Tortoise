
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Snake1Panel extends JPanel{
    JLabel snake1Label;
    private JTextField snake1Name;
    JLabel snake1ColorLabel;
    private JButton redSnake;
    private JButton orangeSnake;
    private JButton yellowSnake;
    
    Snake1Panel() {
        GridLayout border = new GridLayout(6, 1);
        this.setLayout(border);
        snake1Label = new JLabel("Snake 1's Settings");
        snake1Name = new JTextField("Snake 1's Name");
        snake1ColorLabel = new JLabel("Snake 1's Color:");
        redSnake = new JButton("Red");
        orangeSnake = new JButton("Orange");
        yellowSnake = new JButton("Yellow");
        
        add(snake1Label);
        snake1Label.setHorizontalAlignment(JLabel.CENTER);
        add(snake1Name);
        add(redSnake);
        add(orangeSnake);
        add(yellowSnake);
    }
    
    public JButton getRedSnakeButton() {
        return redSnake;
    }
    
    public JButton getOrangeSnakeButton() {
        return orangeSnake;
    }
    
    public JButton getYellowSnakeButton() {
        return yellowSnake;
    }
    
    public String getSnake1Name() {
        return snake1Name.getText();
    }
    
}
