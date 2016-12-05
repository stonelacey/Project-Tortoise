import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GamePanel extends JPanel
{
    //Window in focus variable
    private final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    
    //Action strings
    private final String MOVE_UP = "move up";
    private final String MOVE_DOWN = "move down";
    private final String MOVE_LEFT = "move left";
    private final String MOVE_RIGHT = "move right";
    
    private OptionsModel optMod;
    private JPanel gameArea;
    
    GamePanel(OptionsModel optMod)
    {
        this.optMod = optMod;
        
        gameArea = new JPanel();
        gameArea.setSize(750, 450);
        
        JLabel backcolor = new JLabel();
        JLabel snake1color = new JLabel();
        JLabel snake2color = new JLabel();
        Object snake1 = new Object();
        add(backcolor);
        add(snake1color);
        add(snake2color);
        add(gameArea);
        
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        
        
        int xVal = 50;
        int yVal = 50;
        for (int x = 0; x <= 700; x++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            xVal++;
            
        }
        for (int y = 0; y < 400; y++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            yVal++;
            
        }
        for (int z = 0; z <= 700; z++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            xVal--;
            
        }
        for (int w = 0; w < 400; w++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            yVal--;
            
        }
        
        //Background color
        g.setColor(optMod.getBackgroundTempColor());
        g.fillRect(53, 53, 698, 397);
        
        //Snake 1 Start
        g.setColor(optMod.getSnake1Color());
        g.fillRect(78, 225, 25, 25);
        
        //Snake 2 Start
        g.setColor(optMod.getSnake2Color());
        g.fillRect(700, 225, 25, 25);
        
        snake1color.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), MOVE_UP);
        snake1color.getInputMap(IFW).put(KeyStroke.getKeyStroke("DOWN"), MOVE_DOWN);
        snake1color.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), MOVE_LEFT);
        snake1color.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), MOVE_RIGHT);
    
    }
    
    public void setColor(String color3, String color1, String color2)
    {
        
    }
    
}
