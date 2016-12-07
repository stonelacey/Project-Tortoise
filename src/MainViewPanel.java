    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    
    
public class MainViewPanel extends JPanel
{
    MainButtonPanel buttonPanel;
    private SplashPanel splash;
    private OptionsView opVi;
    private CreditPanel credPan;
    private InstructPanel instPan;
    private GamePanel gamePan;

    
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
        
    public void addCredits(CreditPanel credPan) 
    {
        this.credPan = credPan;
        add(credPan, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    public void addInstruct(InstructPanel instPan)
    {
        this.instPan = instPan;
        add(instPan, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addGame(GamePanel gamePan)
    {
        this.gamePan = gamePan;
        add(gamePan, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    //removers
    public void removeSplash()
    {
        remove(splash);
    }
    
    public void removeOptions()
    {
        if(this.opVi != null)
        remove(opVi);
    }
    
    public void removeCredits()
    {
        if(this.credPan != null)
        remove(credPan);
    }
    
    
    public void removeInst()
    {
        if(this.instPan != null)
        remove(instPan);
    
    }
    
    public void removeGame()
    {
        if(this.gamePan != null)
            remove(gamePan);
    }


}
