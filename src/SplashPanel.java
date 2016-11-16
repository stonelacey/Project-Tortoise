import javax.swing.*;



public class SplashPanel extends JPanel{
    JButton splash;
    SplashPanel()
    {
        splash = new JButton(new ImageIcon("src/images/splash.png"));
        add(splash);
    }
}
