import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
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
    
    //Movements
    private final int UP = 0;
    private final int DOWN = 1;
    private final int RIGHT = 2;
    private final int LEFT = 3;
    
    private final JButton button;
    
    private OptionsModel optMod;
    private JPanel gameArea;
    
    int snake1CurrentX = 78;
    int snake1CurrentY = 225;
    int snake2CurrentX = 700;
    int snake2CurrentY = 225;
    
    GamePanel(OptionsModel optMod)
    {
        this.optMod = optMod;
        
        gameArea = new JPanel();
        gameArea.setSize(750, 450);
        
        button = new JButton("Test button, please ignore.");
        button.setBounds(0,0,1,1);
        
        add(gameArea);
        button.setVisible(false);
        add(button);
        
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
        g.fillRect(snake1CurrentX, snake1CurrentY, 25, 25);
        
        //Snake 2 Start
        
        g.setColor(optMod.getSnake2Color());
        g.fillRect(snake2CurrentX, snake2CurrentY, 25, 25);
        
        //Input maps
        button.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), MOVE_UP);
        button.getInputMap(IFW).put(KeyStroke.getKeyStroke("DOWN"), MOVE_DOWN);
        button.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), MOVE_LEFT);
        button.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), MOVE_RIGHT);
        
        //Action maps
        button.getActionMap().put(MOVE_UP, new MoveAction(UP));
        button.getActionMap().put(MOVE_DOWN, new MoveAction(DOWN));
        button.getActionMap().put(MOVE_LEFT, new MoveAction(LEFT));
        button.getActionMap().put(MOVE_RIGHT, new MoveAction(RIGHT));
    
    }
    
    private class MoveAction extends AbstractAction {
        private final int direction;
        private final int speed = 5;
        
        public MoveAction(int direction) {
            this.direction = direction;
        }
        
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
          //  g.setColor(optMod.getSnake2Color());
            if (direction == UP) {
                snake2CurrentY += 25;
            } if (direction == DOWN) {
                snake2CurrentY -= 25;
            } if (direction == RIGHT) {
                snake2CurrentX += 25;
            } if (direction == LEFT) {
                snake2CurrentX -= 25;
            }
         //   g.fillRect(snake2CurrentX, snake2CurrentY, 25, 25);
         System.out.println(snake2CurrentX + " " + snake2CurrentY);
            
        }
    }
    
    public void setColor(String color3, String color1, String color2)
    {
       
    }
    
}
