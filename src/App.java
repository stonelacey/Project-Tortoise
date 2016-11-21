
public class App {


    public static void main(String[] args) {
        
        MainModel model = new MainModel();
        MainView view = new MainView();        
        MainController controller = new MainController(model, view);
        
        view.setVisible(true);
        
    }
    
}
