//Main View 
//Acts as a frame and something else, will update later

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;


    public class MainView extends JFrame
    {
        MainViewPanel mainVi;
        OptionsView opVi;
        
        MainView()
        {

            //frame stuff
            setTitle("Snake: 2 Player Apocalypse Edition");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 600); 
            
            mainVi = new MainViewPanel();
            add(mainVi);
            
        
            
        }
        
        
        
        public void addOptionListener(ActionListener al)
        {
            mainVi.getButPan().getOptions().addActionListener(al);
        }
        
        public void addCreditListener(ActionListener al)
        {
            mainVi.getButPan().getCredits().addActionListener(al);
        }
        public void addInstructListener(ActionListener al)
        {
            mainVi.getButPan().getInstruct().addActionListener(al);
        }
        
        
        public void showOptions(OptionsView opVi)
        {
            mainVi.removeSplash();
            mainVi.addOptions(opVi);
        }
        
        public void showCredits(CreditPanel credPan)
        {
            mainVi.removeSplash();  
            mainVi.addCredits(credPan);
        }
        
        public void showInstructions(InstructPanel instPan)
        {
            mainVi.removeSplash();
        }

    }
