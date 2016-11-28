//DINO

import javax.swing.*;

public class CreditPanel extends JPanel
{
    JLabel developers;
    JLabel matt;
    JLabel dino;
    JLabel stone;
    JLabel spacer;
    JLabel className;
    JLabel project;
    JLabel date;
    
    CreditPanel()
    {
        developers = new JLabel("Developers:");
        matt = new JLabel("Matthew Guyan");
        dino = new JLabel("Adrianne Kubiak");
        stone = new JLabel("Stone Lacey");
        spacer = new JLabel();
        className = new JLabel("IST 242");
        project = new JLabel("Final Project");
        date = new JLabel("December 2016");
    }
}
