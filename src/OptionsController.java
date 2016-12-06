
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//Matt
public class OptionsController {
    
    private OptionsModel model;
    private OptionsView view;
    private Snake1Panel s1Panel;
    private Snake2Panel s2Panel;
    private GenOptPanel genOpt;
    
    OptionsController(OptionsModel model, OptionsView view) {
        this.model = model;
        this.view = view;
        s1Panel = new  Snake1Panel();
        s2Panel = new Snake2Panel();
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton) e.getSource();
                if (clickSource == view.getRedSnakeButton()) {
                    
                    model.setSnake1ColorString("Red");
                    model.setSnake1TempColor(Color.RED);
                    System.out.println("Red button pressed");
                    
                } else if (clickSource == view.getOrangeSnakeButton()) {
                    
                    model.setSnake1ColorString("Orange");
                    model.setSnake1TempColor(Color.ORANGE);
                    System.out.println("Orange button pressed");
                    
                } else if (clickSource == view.getYellowSnakeButton()) {
                    
                    model.setSnake1ColorString("Yellow");
                    model.setSnake1TempColor(Color.YELLOW);
                    System.out.println("Yellow button pressed");
                    
                } else if (clickSource == view.getGreenSnakeButton()) {
                    
                    model.setSnake2ColorString("Green");
                    model.setSnake2TempColor(Color.GREEN);
                    System.out.println("Green button pressed");
                    
                } else if (clickSource == view.getBlueSnakeButton()) {
                    
                    model.setSnake2ColorString("Blue");
                    model.setSnake2TempColor(Color.BLUE);
                    System.out.println("Blue button pressed");
                
                } else if (clickSource == view.getPurpleSnakeButton()) {
                    
                    model.setSnake2ColorString("Purple");
                    model.setSnake2TempColor(Color.MAGENTA);
                    System.out.println("Purple button pressed");
                
                } else if (clickSource == view.getWhiteBackgroundButton()) {
                    
                    model.setBackgroundColorString("White");
                    model.setBackgroundTempColor(Color.WHITE);
                    System.out.println("White button pressed");
                
                } else if (clickSource == view.getBlackBackgroundButton()) {
                    
                    model.setBackgroundColorString("Black");
                    model.setBackgroundTempColor(Color.BLACK);
                    System.out.println("Black button pressed");
                
                } else if (clickSource == view.getGrayBackgroundButton()) {
                    
                    model.setBackgroundColorString("Gray");
                    model.setBackgroundTempColor(Color.GRAY);
                    System.out.println("Gray button pressed");
                
                } else if (clickSource == view.getSaveButton()) {

                    model.setSnakeName();
                    model.setSnake1Color(model.getSnake1TempColor());
                    model.setSnake2Color(model.getSnake2TempColor());
                    model.setBackColor(model.getBackgroundTempColor());
                    model.setLabels();
                    System.out.println("Save button pressed");
                
                } else if (clickSource == view.getCancelButton()) {
                    
                    System.out.println("Cancel button pressed");
                    
                }
            }
        }
        
        view.ButtonListener(new ButtonListener());
        
    }
    
}
