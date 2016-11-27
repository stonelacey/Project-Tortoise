//this class is for the buttons to be all nice and neat the way we want it

//importing swing
import javax.swing.*;
import java.awt.*;


public class MainButtonPanel extends JPanel{
    //buttons, label
    private JLabel snake1Name;
    private JLabel snake1Score;
    private JLabel snake2Name;
    private JLabel snake2Score;
    private JButton options;
    private JButton scores;
    private JButton credits;
    private JButton instruct;
    
    MainButtonPanel()
    {
        //layout 
        GridLayout grid = new GridLayout(2,4);
        this.setLayout(grid);
        
        //initialization
        snake1Name = new JLabel("Default 1 Name");
        snake1Score = new JLabel("724");
        snake2Name = new JLabel("Default 2 Name");
        snake2Score = new JLabel("007");
        options = new JButton("Options");
        scores = new JButton("High Score");
        credits = new JButton("Credits");
        instruct = new JButton("How To Play");
        
        
        //adding to panel
        add(snake1Name);
        add(options);
        add(scores);
        add(snake2Name);
        add(snake1Score);
        add(credits);
        add(instruct);
        add(snake2Score);
         
        
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
    
    
    
    
}
