
public class App {


    public static void main(String[] args) {
        MainView view = new MainView();
        MainModel model = new MainModel();        
        MainController controller = new MainController();
        
        view.setVisible(true);
        
    }
    
}
