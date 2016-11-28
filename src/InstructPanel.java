//DINO

import javax.swing.*;

public class InstructPanel extends JPanel
{
    JLabel instructions;
    JLabel instructions2;
    
    InstructPanel()
    {
        instructions = new JLabel("Instructions\n\n");
        instructions2 = new JLabel("to be written");
        add(instructions);
        add(instructions2);
    }
    
}
