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
            
            vi.addOptionListener(new OptionListener());
        }
        
        
        
        class OptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                vi.showOptions(opVi);
            }
        }
        

    }
