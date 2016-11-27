//DINO
import javax.swing.*;

public class InstructPanel extends JPanel
{
    JTextField instructions;
    
    InstructPanel()
    {
        instructions = new JTextField("Test instructions");        
        add(instructions);
    }
    
}
