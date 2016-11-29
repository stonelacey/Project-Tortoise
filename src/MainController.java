    import java.awt.event.*;


    public class MainController 
    {
        //things for the main
        MainView vi;
        MainModel mo;
        
        //things for options
        OptionsView opVi;
        OptionsController opCon;
        OptionsModel opMod;
        
        //things for credits and instructions
        CreditPanel credPan;
        InstructPanel instPan;
        GamePanel gamePan;
        
        Snake snake1, snake2;
        
        public MainController(MainModel mo, MainView vi)
        {
            this.vi = vi;
            this.mo = mo;
            
            opMod = new OptionsModel();
            opVi = new OptionsView();
            opCon = new OptionsController(opMod, opVi);
            credPan = new CreditPanel();
            instPan = new InstructPanel();
            gamePan = new GamePanel(opMod);
            
            vi.addOptionListener(new OptionListener());
            vi.addCreditListener(new CreditListener());
            vi.addInstructListener(new InstructListener());
            vi.addGameListener(new GameListener());
        }
        
        
        
        class OptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                vi.showOptions(opVi);
            }
        }
        
        class CreditListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                vi.showCredits(credPan);
            }
        
        }
        
        class InstructListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                vi.showInstructions(instPan);
            }
        
        }
        
        class GameListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                gamePan.setColor(snake1.getSnakeColorString(), snake2.getSnakeColorString(), opMod.getBackgroundColorString());
                vi.showGame(gamePan);
            }
        }

    }
