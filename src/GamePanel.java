import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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
    
    private final String MOVE_UP1 = "move up1";
    private final String MOVE_DOWN1 = "move down1";
    private final String MOVE_LEFT1 = "move left1";
    private final String MOVE_RIGHT1 = "move right1";
    
    //Movements
    private final int UP = 0;
    private final int DOWN = 1;
    private final int RIGHT = 2;
    private final int LEFT = 3;
    private final int UP1 = 4;
    private final int DOWN1 = 5;
    private final int RIGHT1 = 6;
    private final int LEFT1 = 7;
    
    private  InputMap button;
    private final ActionMap am;
    
    private  InputMap button1;
    private final ActionMap am1;
    
    private OptionsModel optMod;
    private JPanel gameArea;
    
    int snake1CurrentX;
    int snake1CurrentY;
    int snake2CurrentX;
    int snake2CurrentY;
    
    GamePanel(OptionsModel optMod)
    {
        this.optMod = optMod;
        
        gameArea = new JPanel();
        gameArea.setSize(750, 450);
        
        button = getInputMap(IFW);
        am = getActionMap();
        
        button1 = getInputMap(IFW);
        am1 = getActionMap();
        
        
        
        add(gameArea);
      
    }
    
    public void resetSnakes()
    {
        snake1CurrentX = 78;
        snake1CurrentY = 225;
        snake2CurrentX = 703;
        snake2CurrentY = 225;
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        
        
        int xVal = 50;
        int yVal = 47;
        
        for (int x = 0; x < 703; x++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            xVal++;
            
        }
        for (int y = 0; y < 403; y++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            yVal++;
            
        }
        for (int z = 0; z < 703; z++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            xVal--;
            
        }
        for (int w = 0; w < 403; w++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            yVal--;
            
        }
        
        
        
        //Background color
        g.setColor(optMod.getBackgroundTempColor());
        g.fillRect(53, 50, 700, 400);
        
        //Snake 1 Start
        g.setColor(optMod.getSnake1Color());
        g.fillRect(snake1CurrentX, snake1CurrentY, 25, 25);
        
        //Snake 2 Start
        
        g.setColor(optMod.getSnake2Color());
        g.fillRect(snake2CurrentX, snake2CurrentY, 25, 25);
        
        //Input maps, p2
        button.put(KeyStroke.getKeyStroke("UP"), MOVE_UP);
        button.put(KeyStroke.getKeyStroke("DOWN"), MOVE_DOWN);
        button.put(KeyStroke.getKeyStroke("LEFT"), MOVE_LEFT);
        button.put(KeyStroke.getKeyStroke("RIGHT"), MOVE_RIGHT);
        
                //Input maps, p1
        button.put(KeyStroke.getKeyStroke("W"), MOVE_UP1);
        button.put(KeyStroke.getKeyStroke("S"), MOVE_DOWN1);
        button.put(KeyStroke.getKeyStroke("A"), MOVE_LEFT1);
        button.put(KeyStroke.getKeyStroke("D"), MOVE_RIGHT1);
        
        //Action maps p2
        am.put(MOVE_UP, new MoveAction(UP));
        am.put(MOVE_DOWN, new MoveAction(DOWN));
        am.put(MOVE_LEFT, new MoveAction(LEFT));
        am.put(MOVE_RIGHT, new MoveAction(RIGHT));
        
        
        //Action Maps P1
        am.put(MOVE_UP1, new MoveAction(UP1));
        am.put(MOVE_DOWN1, new MoveAction(DOWN1));
        am.put(MOVE_LEFT1, new MoveAction(LEFT1));
        am.put(MOVE_RIGHT1, new MoveAction(RIGHT1));
   
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
                
                snake2CurrentY -= 25;                
                }
             if (direction == DOWN) {
                snake2CurrentY += 25;
            } if (direction == RIGHT) {
                snake2CurrentX += 25;
            } if (direction == LEFT) {
                snake2CurrentX -= 25;
            }
            
            //player 1
            if (direction == UP1) {
                
                snake1CurrentY -= 25;  
                System.out.println("up");
                }
             if (direction == DOWN1) {
                snake1CurrentY += 25;
            } if (direction == RIGHT1) {
                snake1CurrentX += 25;
            } if (direction == LEFT1) {
                snake1CurrentX -= 25;
            }
            
            repaint();
            revalidate();
         //   g.fillRect(snake2CurrentX, snake2CurrentY, 25, 25);
         System.out.println("Snake 2: "+ snake2CurrentX + " " + snake2CurrentY);
         System.out.println("Snake 1: " +snake1CurrentX + " " + snake1CurrentY);
         checkCollision();   
        }
    }
    
    public void checkCollision()
    {
        //check for if snakes collide
       if ((snake1CurrentX == snake2CurrentX)&&(snake1CurrentY==snake2CurrentY))
       {
           resetSnakes();
       }
       
       //check if outside boundry
       if ((snake2CurrentY > 425)||(snake2CurrentY < 50))
       {
           resetSnakes();
       }
       
       if ((snake1CurrentY > 425)||(snake1CurrentY < 50))
       {
           resetSnakes();
       }
       
       if ((snake2CurrentX > 728)||(snake2CurrentX < 53))
       {
           resetSnakes();
       }
       if ((snake1CurrentX > 728)||(snake1CurrentX < 53))
       {
           resetSnakes();
       }

    }
    
}
