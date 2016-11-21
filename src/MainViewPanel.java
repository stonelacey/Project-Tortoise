    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    
    
public class MainViewPanel extends JPanel
{
    private MainButtonPanel buttonPanel;
    private SplashPanel splash;
    private OptionsView opVi;

    
    MainViewPanel()
    {
        super();
                    //initializations
            setLayout(new BorderLayout());
        buttonPanel = new MainButtonPanel();
        splash = new SplashPanel();
                    //panel and whatnot
           add(buttonPanel, BorderLayout.NORTH);
            add(splash, BorderLayout.CENTER);
    }
    
    
    public MainButtonPanel getButPan()
    {
        return buttonPanel;
    
    }
    
    
    public void addOptions(OptionsView opVi)
    {
        
        this.opVi = opVi;
        add(opVi, BorderLayout.CENTER);
        revalidate();
        repaint();
        
    }
    
    //removers
    public void removeSplash()
    {
        remove(splash);
    }
}
