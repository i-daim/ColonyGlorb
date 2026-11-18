package upc;
import javafx.application.Application;
import javafx.stage.Stage;
import upc.utils.SceneManager;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ColonyGlorb");
        SceneManager.init(stage);
        SceneManager.showMainMenu();
        stage.show();
    }
}
