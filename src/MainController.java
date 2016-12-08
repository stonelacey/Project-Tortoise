import java.awt.Color;
    import java.awt.event.*;
import javax.swing.JButton;

    public class MainController 
    {
        //things for the main
        MainView vi;
        MainButtonPanel mBPanel;
        
        //things for options
        OptionsView opVi;
        OptionsController opCon;
        OptionsModel opMod;
        
        //things for credits and instructions
        CreditPanel credPan;
        InstructPanel instPan;
        GamePanel gamePan;
        
        Snake snake1, snake2;
        
        public MainController( MainView vi)
        {
            this.vi = vi;
            
            opMod = new OptionsModel();
            opVi = new OptionsView();
            opCon = new OptionsController(opMod, opVi);
            credPan = new CreditPanel();
            instPan = new InstructPanel();
            gamePan = new GamePanel(opMod);
            mBPanel = new MainButtonPanel();
            
            vi.addOptionListener(new OptionListener());
            vi.addCreditListener(new CreditListener());
            vi.addInstructListener(new InstructListener());
            vi.addGameListener(new GameListener());
            this.opVi.ButtonListener(new ButtonListener());
            
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
               // gamePan.setColor(opMod.getBackgroundColorString(), opMod.getSnake1ColorString(), opMod.getSnake2ColorString());
              //  mBPanel.setName(opMod.getSnake1Name(), opMod.getSnake2Name());
                vi.showGame(gamePan);
            }
        }
        
            class ButtonListener implements ActionListener 
            {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton) e.getSource();
                if (clickSource == opVi.getRedSnakeButton()) {
                    
                    opMod.setSnake1ColorString("Red");
                    opMod.setSnake1TempColor(Color.RED);
                    System.out.println("Red button pressed");
                    
                } else if (clickSource == opVi.getOrangeSnakeButton()) {
                    
                    opMod.setSnake1ColorString("Orange");
                    opMod.setSnake1TempColor(Color.ORANGE);
                    System.out.println("Orange button pressed");
                    
                } else if (clickSource == opVi.getYellowSnakeButton()) {
                    
                    opMod.setSnake1ColorString("Yellow");
                    opMod.setSnake1TempColor(Color.YELLOW);
                    System.out.println("Yellow button pressed");
                    
                } else if (clickSource == opVi.getGreenSnakeButton()) {
                    
                    opMod.setSnake2ColorString("Green");
                    opMod.setSnake2TempColor(Color.GREEN);
                    System.out.println("Green button pressed");
                    
                } else if (clickSource == opVi.getBlueSnakeButton()) {
                    
                    opMod.setSnake2ColorString("Blue");
                    opMod.setSnake2TempColor(Color.BLUE);
                    System.out.println("Blue button pressed");
                
                } else if (clickSource == opVi.getPurpleSnakeButton()) {
                    
                    opMod.setSnake2ColorString("Purple");
                    opMod.setSnake2TempColor(Color.MAGENTA);
                    System.out.println("Purple button pressed");
                
                } else if (clickSource == opVi.getWhiteBackgroundButton()) {
                    
                    opMod.setBackgroundColorString("White");
                    opMod.setBackgroundTempColor(Color.WHITE);
                    System.out.println("White button pressed");
                
                } else if (clickSource == opVi.getBlackBackgroundButton()) {
                    
                    opMod.setBackgroundColorString("Black");
                    opMod.setBackgroundTempColor(Color.BLACK);
                    System.out.println("Black button pressed");
                
                } else if (clickSource == opVi.getGrayBackgroundButton()) {
                    
                    opMod.setBackgroundColorString("Gray");
                    opMod.setBackgroundTempColor(Color.GRAY);
                    System.out.println("Gray button pressed");
                
                } else if (clickSource == opVi.getSaveButton()) {

                    
                    opMod.setSnake1Color(opMod.getSnake1TempColor());
                    opMod.setSnake2Color(opMod.getSnake2TempColor());
                    opMod.setBackColor(opMod.getBackgroundTempColor());
                    gamePan.setNames(opVi.getS1Name(),opVi.getS2Name() );
                    
                    
                    
                    
                    System.out.println("Save button pressed");
                
                } else if (clickSource == opVi.getCancelButton()) {
                    
                    System.out.println("Cancel button pressed");
                    
                }
                
            
            }
            

        }
        
        

    }
