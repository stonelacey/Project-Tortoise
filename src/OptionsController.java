
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
                    
                    
                    model.setSnake1TempColor(Color.RED, "red");
                    System.out.println("Red button pressed");
                    
                } else if (clickSource == view.getOrangeSnakeButton()) {
                    model.setSnake1TempColor(Color.ORANGE, "orange");
                    System.out.println("Orange button pressed");
                    
                } else if (clickSource == view.getYellowSnakeButton()) {
                    model.setSnake1TempColor(Color.YELLOW, "yellow");
                    System.out.println("Yellow button pressed");
                    
                } else if (clickSource == view.getGreenSnakeButton()) {
                    model.setSnake2TempColor(Color.GREEN, "green");
                    System.out.println("Green button pressed");
                    
                } else if (clickSource == view.getBlueSnakeButton()) {
                    model.setSnake2TempColor(Color.BLUE, "blue");
                    System.out.println("Blue button pressed");
                
                } else if (clickSource == view.getPurpleSnakeButton()) {
                    model.setSnake2TempColor(Color.MAGENTA, "magenta");
                    System.out.println("Purple button pressed");
                
                } else if (clickSource == view.getWhiteBackgroundButton()) {
                    model.setBackColor(Color.WHITE, "white");
                    System.out.println("White button pressed");
                
                } else if (clickSource == view.getBlackBackgroundButton()) {
                
                    model.setBackColor(Color.BLACK, "black");
                    System.out.println("Black button pressed");
                
                } else if (clickSource == view.getGrayBackgroundButton()) {
                
                    model.setBackColor(Color.GRAY, "GRAY");
                    System.out.println("Gray button pressed");
                
                } else if (clickSource == view.getSaveButton()) {
                    model.setSnakeColor();
                    model.setSnakeName("","");
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
