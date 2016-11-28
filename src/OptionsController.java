
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
                    System.out.println("Red button pressed");
                } else if (clickSource == view.getOrangeSnakeButton()) {
                    
                } else if (clickSource == view.getYellowSnakeButton()) {
                    
                } else if (clickSource == view.getGreenSnakeButton()) {
                    
                } else if (clickSource == view.getBlueSnakeButton()) {
                    
                } else if (clickSource == view.getPurpleSnakeButton()) {
                    
                } else if (clickSource == view.getWhiteBackgroundButton()) {
                    
                } else if (clickSource == view.getBlackBackgroundButton()) {
                    
                } else if (clickSource == view.getGrayBackgroundButton()) {
                    
                } else if (clickSource == view.getSaveButton()) {
                    
                } else if (clickSource == view.getCancelButton()) {
                    
                }
            }
        }
        
        view.ButtonListener(new ButtonListener());
        
    }
    
}
