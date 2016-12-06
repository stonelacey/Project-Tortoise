import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;


//source for webpage code:
//http://stackoverflow.com/questions/10967451/open-a-link-in-browser-with-java-button

public class SplashPanel extends JPanel{
    JButton splash;
    SplashPanel()
    {
        splash = new JButton(new ImageIcon("src/images/splash.png"));
        add(splash);
        addOptionListener(new ButtonListener());
    }
    
    public void addOptionListener(ActionListener al)
        {
            splash.addActionListener(al);
        }
    
    class ButtonListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                openWebpage("https://www.youtube.com/watch?v=r6gGcrjDmec");
            }
        }
    
    public static void openWebpage(String urlString) {
    try {
        Desktop.getDesktop().browse(new URL(urlString).toURI());
    } catch (Exception e) {
        e.printStackTrace();
    
    

    }
    
    
    
    
    
    
}
}


