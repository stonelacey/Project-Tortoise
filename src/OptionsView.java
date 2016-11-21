import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OptionsView extends JPanel{
    private GenOptPanel optionPanel;
    private Snake1Panel snake1Panel;
    private Snake2Panel snake2Panel;
    
    OptionsView() {
        BorderLayout border = new BorderLayout();
        optionPanel = new GenOptPanel();
        snake1Panel = new Snake1Panel();
        snake2Panel = new Snake2Panel();
        
        
        this.setLayout(border);
        add(optionPanel, BorderLayout.CENTER);
        add(snake1Panel, BorderLayout.WEST);
        add(snake2Panel, BorderLayout.EAST);
    }
}
