import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import java.util.ArrayList;

public class GamePanel extends JPanel
{
    private boolean gamePlayedOnce = false;
    //arraylist for x and y vals
    ArrayList <Integer> snake1XVals;
    ArrayList <Integer> snake1YVals;
    ArrayList <Integer> snake2XVals;
    ArrayList <Integer> snake2YVals;
    
    //Timer
    private Timer timer;
    boolean timerStarted = false;

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
    
    private int direct1 = RIGHT1, direct2 = LEFT;
    
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
        
        timer = new Timer();
        
        this.snake1XVals = new ArrayList<Integer>();
        this.snake1YVals = new ArrayList<Integer>();
        this.snake2XVals = new ArrayList<Integer>();
        this.snake2YVals = new ArrayList<Integer>();

        
        
        add(gameArea);
        
        
      
    }
    
    public void resetSnakes()
    {
        if (gamePlayedOnce == true)
        {
        this.snake1XVals.clear();
        this.snake1YVals.clear();
        this.snake2XVals.clear();
        this.snake2YVals.clear();
        }
        snake1CurrentX = 78;
        snake1CurrentY = 225;
        snake2CurrentX = 703;
        snake2CurrentY = 225;

        
        timerStarted = false;
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
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
        snake1XVals.add(snake1CurrentX);
        snake1YVals.add(snake1CurrentY);
         for (int y = 0; y < this.snake1XVals.size(); y++)
        {
            g.fillRect(this.snake1XVals.get(y), this.snake1YVals.get(y), 25, 25);
        }
        //Snake 2 Start

        g.setColor(optMod.getSnake2Color());
        g.fillRect(snake2CurrentX, snake2CurrentY, 25, 25);
                    this.snake2XVals.add(snake2CurrentX);
            this.snake2YVals.add(snake2CurrentY);
        
        
        for (int x = 0; x < this.snake2XVals.size(); x++)
        {
            g.fillRect(this.snake2XVals.get(x), this.snake2YVals.get(x), 25, 25);
        }

        
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
        private  int direction;

        
        public MoveAction(int direction) {
            this.direction = direction;
        }
        
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (direction == UP) {
                
                direct2 = UP;
                }
             if (direction == DOWN) {

                direct2 = DOWN;
            } if (direction == RIGHT) {

                direct2 = RIGHT;
            } if (direction == LEFT) {

                direct2 = LEFT;
            }
            
            
            
            //player 1
            if (direction == UP1) {
                
 
                direct1 = UP1;
                }
             if (direction == DOWN1) {
 
                direct1 = DOWN1;
            } if (direction == RIGHT1) {

                direct1 = RIGHT1;
            } if (direction == LEFT1) {

                direct1 = LEFT1;
            }
            repaint();
            revalidate();
   
         if (timerStarted == false)
         {
            timerStarted = true;
            resumeTimer();
         }
         checkCollision();   
        }
    }
    

    public void checkCollision()
    {
        this.gamePlayedOnce = true;
        //check for if snakes collide
       if ((snake1CurrentX == snake2CurrentX)&&(snake1CurrentY==snake2CurrentY))
       {
           resetSnakes();
           pauseTimer();

       }
       
       //check if outside boundry
       if ((snake2CurrentY > 425)||(snake2CurrentY < 50))
       {
           resetSnakes();
           pauseTimer();

       }
       
       if ((snake1CurrentY > 425)||(snake1CurrentY < 50))
       {
           resetSnakes();
           pauseTimer();

       }
       
       if ((snake2CurrentX > 728)||(snake2CurrentX < 53))
       {
           resetSnakes();
           pauseTimer();

       }
       if ((snake1CurrentX > 728)||(snake1CurrentX < 53))
       {
           resetSnakes();
           pauseTimer();

       }
       
       
       
           
       for (int z = 0; z < this.snake1YVals.size(); z++)
       {
           if ((snake2CurrentX == this.snake1XVals.get(z)) && (snake2CurrentY == this.snake1YVals.get(z)))
           {
               resetSnakes();
               pauseTimer();
           }
       
       }
       
       for (int a = 0; a < this.snake1YVals.size(); a++)
       {
           if ((snake1CurrentX == this.snake2XVals.get(a)) && (snake1CurrentY == this.snake2YVals.get(a)))
           {
               resetSnakes();
               pauseTimer();
           }
       
       }
       
       for (int b = 1; b < this.snake1YVals.size(); b++)
       {
           if ((snake1CurrentX == this.snake1XVals.get(b-1)) && (snake1CurrentY == this.snake1YVals.get(b-1)))
           {
               resetSnakes();
               pauseTimer();
           }
       
       }
       
       
       for (int b = 1; b < this.snake2YVals.size(); b++)
       {
           if ((snake2CurrentX == this.snake2XVals.get(b-1)) && (snake2CurrentY == this.snake2YVals.get(b-1)))
           {
               resetSnakes();
               pauseTimer();
           }
       
       }
       
    }
    
    public void pauseTimer()
    {
        this.timer.cancel();
        this.timer.purge();
        direct1 = RIGHT1; 
        direct2 = LEFT;
    }
    
    public void resumeTimer()
    {
        this.timer = new Timer();
        TimerTask task = new TimerTask() {
           public void run()
           {
            if (direct2 == UP) {
                
                snake2CurrentY -= 25;                
            }   
             if (direct2 == DOWN) {
                snake2CurrentY += 25;
            } if (direct2 == RIGHT) {
                snake2CurrentX += 25;
            } if (direct2 == LEFT) {
                snake2CurrentX -= 25;
            }
            
            //player 1
            if (direct1 == UP1) {
                
                snake1CurrentY -= 25;  
                
                }
             if (direct1 == DOWN1) {
                snake1CurrentY += 25;
            } if (direct1 == RIGHT1) {
                snake1CurrentX += 25;
            } if (direct1 == LEFT1) {
                snake1CurrentX -= 25;
            }
            
            repaint();
            revalidate();
            checkCollision();
            
           }
       };
        timer.scheduleAtFixedRate(task, 00, 125);
        
    }
    
   
    
    
}
