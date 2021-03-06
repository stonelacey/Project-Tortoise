//DINO

import javax.swing.*;
import java.awt.*;

public class CreditPanel extends JPanel
{
    GridLayout credits;
    JLabel developers;
    JLabel matt;
    JLabel dino;
    JLabel stone;
    JLabel spacer;
    JLabel className;
    JLabel project;
    JLabel date;
    JLabel bonus;
    
    CreditPanel()
    {
        credits = new GridLayout(8, 1);
        this.setLayout(credits);
        
        developers = new JLabel("Developers:");
        matt = new JLabel("Matthew Guyan");
        dino = new JLabel("Adrianne Kubiak");
        stone = new JLabel("Stone Lacey");
        spacer = new JLabel();
        className = new JLabel("IST 242");
        project = new JLabel("Final Project");
        date = new JLabel("December 2016");
        bonus = new JLabel("Here's a video: https://www.youtube.com/watch?v=r6gGcrjDmec");
        
        add(developers);
        add(matt);
        add(dino);
        add(stone);
        add(spacer);
        add(className);
        add(project);
        add(date);
        //add(bonus);
        
        developers.setHorizontalAlignment(JLabel.CENTER);
        matt.setHorizontalAlignment(JLabel.CENTER);
        dino.setHorizontalAlignment(JLabel.CENTER);
        stone.setHorizontalAlignment(JLabel.CENTER);
        spacer.setHorizontalAlignment(JLabel.CENTER);
        className.setHorizontalAlignment(JLabel.CENTER);
        project.setHorizontalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
        //bonus.setHorizontalAlignment(JLabel.CENTER);
    }
}
