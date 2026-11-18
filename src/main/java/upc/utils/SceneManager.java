package upc.utils;

import javafx.scene.Scene;
import javafx.stage.Stage;
import upc.controller.MainMenuController;
import upc.controller.SettingsController;

public class SceneManager {

    private static Stage primaryStage;
    private static Scene mainScene;

    public static void init(Stage stage) {
        primaryStage = stage;
        MainMenuController menuController = new MainMenuController();
        mainScene = new Scene(menuController.getRoot(), 800, 600);
        primaryStage.setScene(mainScene);
    }

    public static void showMainMenu() {
        MainMenuController controller = new MainMenuController();
        mainScene.setRoot(controller.getRoot());
    }

    public static void showSettings() {
        SettingsController controller = new SettingsController();
        mainScene.setRoot(controller.getRoot());
    }

    public static void setFullScreen(boolean fullscreen) {
        if (primaryStage != null) {
            primaryStage.setFullScreen(fullscreen);
        }
    }

    public static boolean isFullScreen() {
        return primaryStage != null && primaryStage.isFullScreen();
    }

}
