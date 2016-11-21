    import java.awt.event.*;


    public class MainController 
    {
        //things for the main
        MainView vi;
        MainModel mo;
        
        //things for options
        OptionsView opVi;
        
        public MainController(MainModel mo, MainView vi)
        {
            this.vi = vi;
            this.mo = mo;
            
            opVi = new OptionsView();
            
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
