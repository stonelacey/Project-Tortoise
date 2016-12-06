//Main View 
//Acts as a frame and something else, will update later

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;


    public class MainView extends JFrame
    {
        MainViewPanel mainVi;
        OptionsView opVi;
        CreditPanel credPan;
        InstructPanel instPan;
        
        MainView()
        {

            //frame stuff
            setTitle("Snake: 2 Player Apocalypse Edition");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 600); 
            setResizable(false);
            
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
        public void addGameListener(ActionListener al)
        {
            mainVi.getButPan().getGame().addActionListener(al);
        }
        
        
        public void showOptions(OptionsView opVi)
        {
            mainVi.removeGame();
            mainVi.removeInst();
            mainVi.removeCredits();
            mainVi.removeSplash();
            mainVi.addOptions(opVi);
        }
        
        public void showGame(GamePanel gamePan)
        {
            mainVi.removeOptions();
            mainVi.removeInst();
            mainVi.removeCredits();
            mainVi.removeSplash();
            mainVi.addGame(gamePan);
            gamePan.resetSnakes();
        }
        
        public void showCredits(CreditPanel credPan)
        {
            mainVi.removeGame();
            mainVi.removeSplash(); 
            mainVi.removeOptions();
            mainVi.removeInst();
            mainVi.addCredits(credPan);
        }
        
        public void showInstructions(InstructPanel instPan)
        {
            mainVi.removeGame();
            mainVi.removeSplash();
            mainVi.removeCredits();
            mainVi.removeOptions();
            mainVi.addInstruct(instPan);
        }

    }
