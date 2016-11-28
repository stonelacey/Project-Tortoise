
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//Matt
public class OptionsController {
    
    private OptionsModel model;
    private OptionsView view;
    private Snake snake1;
    private Snake snake2;
    
    OptionsController(OptionsModel model, OptionsView view) {
        this.model = model;
        this.view = view;
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton) e.getSource();
                if (clickSource == view.getRedSnakeButton()) {
                    
                    model.setSnake1TempColor(Color.RED);
                    System.out.println("Red button pressed");
                    
                } else if (clickSource == view.getOrangeSnakeButton()) {
                    model.setSnake1TempColor(Color.ORANGE);
                    System.out.println("Orange button pressed");
                    
                } else if (clickSource == view.getYellowSnakeButton()) {
                    model.setSnake1TempColor(Color.YELLOW);
                    System.out.println("Yellow button pressed");
                    
                } else if (clickSource == view.getGreenSnakeButton()) {
                    model.setSnake2TempColor(Color.GREEN);
                    System.out.println("Green button pressed");
                    
                } else if (clickSource == view.getBlueSnakeButton()) {
                    model.setSnake2TempColor(Color.BLUE);
                    System.out.println("Blue button pressed");
                
                } else if (clickSource == view.getPurpleSnakeButton()) {
                    model.setSnake2TempColor(Color.MAGENTA);
                    System.out.println("Purple button pressed");
                
                } else if (clickSource == view.getWhiteBackgroundButton()) {
                    
                    System.out.println("White button pressed");
                
                } else if (clickSource == view.getBlackBackgroundButton()) {
                
                    System.out.println("Black button pressed");
                
                } else if (clickSource == view.getGrayBackgroundButton()) {
                
                    System.out.println("Gray button pressed");
                
                } else if (clickSource == view.getSaveButton()) {
                    model.setSnake1Color(model.getSnake1TempColor());
                    model.setSnake2Color(model.getSnake2TempColor());
                    model.setSnake1Name(model.getSnake1Name());
                    model.setSnake2Name(model.getSnake2Name());
                    System.out.println("Save button pressed");
                
                } else if (clickSource == view.getCancelButton()) {
                    System.out.println("Cancel button pressed");
                }
            }
        }
        
        view.ButtonListener(new ButtonListener());
        
    }
    
}
