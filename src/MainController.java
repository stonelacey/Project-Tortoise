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
        
        public MainController(MainModel mo, MainView vi)
        {
            this.vi = vi;
            this.mo = mo;
            
            opMod = new OptionsModel();
            opVi = new OptionsView();
            opCon = new OptionsController();
            credPan = new CreditPanel();
            instPan = new InstructPanel();
            
            vi.addOptionListener(new OptionListener());
            vi.addCreditListener(new CreditListener());
            vi.addInstructListener(new InstructListener());
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

    }
