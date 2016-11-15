    import javax.swing.*;
    import java.awt.*;


    public class MainView extends JFrame
    {
        private BorderLayout border;
        private MainButtonPanel buttonPanel;
        MainView()
        {
            border = new BorderLayout();
            this.setLayout(border);
            
            buttonPanel = new MainButtonPanel();
            
            
            JPanel panel = new JPanel();
            panel.add(buttonPanel);
            
            this.setContentPane(panel);
            this.pack();
            this.setTitle("Snake, 2 Player Apocolypse Edition");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 600);        
            
        
            
        }

    }
