//DINO

import javax.swing.*;
import java.awt.*;

public class InstructPanel extends JPanel
{
    GridLayout instructions;
    JLabel in1;
    JLabel in2;
    JLabel in3;
    JLabel in4;
    JLabel in5;
    JLabel in6;
    JLabel spacer;
    
    InstructPanel()
    {
        instructions = new GridLayout(11,1);
        this.setLayout(instructions);
        in1 = new JLabel("Instructions:");
        in2 = new JLabel("The objective of the game is to outlast your opponent.");
        in3 = new JLabel("To do so, you must avoid running into anything: yourself, opponent, and walls.");
        in4 = new JLabel("Player 1 will use WASD to move.");
        in5 = new JLabel("Player 2 will use the arrow keys to move.");
        in6 = new JLabel("May the best player win.");
        spacer = new JLabel();
        
        add(in1);
        add(in2);
        add(in3);
        add(in4);
        add(in5);
        add(in6);
        add(spacer);
        add(spacer);
        add(spacer);
        add(spacer);
        add(spacer);
        
        
        in1.setHorizontalAlignment(JLabel.CENTER);
        in2.setHorizontalAlignment(JLabel.CENTER);
        in3.setHorizontalAlignment(JLabel.CENTER);
        in4.setHorizontalAlignment(JLabel.CENTER);
        in5.setHorizontalAlignment(JLabel.CENTER);
        in6.setHorizontalAlignment(JLabel.CENTER);
    }
    
}
