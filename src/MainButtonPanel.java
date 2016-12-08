//this class is for the buttons to be all nice and neat the way we want it

//importing swing
import javax.swing.*;
import java.awt.*;


public class MainButtonPanel extends JPanel{
    //buttons, label
    public JLabel snake1Name;
    private JLabel snake1Score;
    private JLabel snake2Name;
    private JLabel snake2Score;
    private JButton options;
    private JButton credits;
    private JButton instruct;
    private JButton game;
    
    MainButtonPanel()
    {
        //layout 
        GridLayout grid = new GridLayout(2,4);
        this.setLayout(grid);
        
        //initialization
        snake1Name = new JLabel(" ");
        snake1Score = new JLabel(" ");
        snake2Name = new JLabel(" ");
        snake2Score = new JLabel(" ");
        options = new JButton("Options");
        credits = new JButton("Credits");
        instruct = new JButton("How To Play");
        game = new JButton("Play game!!");
        
        
        //adding to panel
        add(snake1Name);
        snake1Name.setHorizontalAlignment(JLabel.CENTER);
        add(game);
        add(options);
        add(snake2Name);
        snake2Name.setHorizontalAlignment(JLabel.CENTER);
        add(snake1Score);
        snake1Score.setHorizontalAlignment(JLabel.CENTER);
        add(credits);
        add(instruct);
        add(snake2Score);
        snake2Score.setHorizontalAlignment(JLabel.CENTER);
         
        
    }
    
    public void set1Name(String play1Name)
    {
        snake1Name.setText(play1Name);

    }
    
    
    public void set2Name(String play2Name)
    {
        snake2Name.setText(play2Name);
    }
    
    public JButton getOptions()
    {
        return options;
    }
    
    public JButton getCredits()
    {
        return credits;
    }
    
    public JButton getInstruct()
    {
        return instruct;
    }
    
    public JButton getGame()
    {
        return game;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
    }
    
    
    
}
