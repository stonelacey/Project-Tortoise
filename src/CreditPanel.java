//DINO

import javax.swing.*;

public class CreditPanel extends JPanel
{
    JLabel credits;
    JLabel credits2;
    
    CreditPanel()
    {
        credits = new JLabel("Developers:\nMatthew Guyan\nAdrianne Kubiak\nStone Lacey\n");
        credits2 = new JLabel("\nIST 242\nFinal Project\nDecember 2016");
        add(credits);
        add(credits2);
    }
}
