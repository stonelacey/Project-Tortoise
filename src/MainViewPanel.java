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

    void addCredits(CreditPanel credPan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
