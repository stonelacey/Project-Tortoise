//Main View 
//Acts as a frame and something else, will update later

    import javax.swing.*;
    import java.awt.*;


    public class MainView extends JFrame
    {

        private MainButtonPanel buttonPanel;
        private SplashPanel splash;
        MainView()
        {
            //initializations
            BorderLayout border = new BorderLayout();
            buttonPanel = new MainButtonPanel();
            splash = new SplashPanel();
            
            //panel and whatnot
            JPanel panel = new JPanel();
            panel.setLayout(border);
            panel.add(buttonPanel, BorderLayout.NORTH);
            panel.add(splash, BorderLayout.CENTER);
            
            //frame stuff
            this.setContentPane(panel);
            this.pack();
            this.setTitle("Snake: 2 Player Apocalypse Edition");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 600); 
            
        
            
        }
        
        public void addListener()
        {
            buttonPanel.getCredits();
        }

    }
