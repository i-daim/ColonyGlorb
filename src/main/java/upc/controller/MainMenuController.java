package upc.controller;

import javafx.scene.Parent;
import upc.utils.SceneManager;
import upc.view.MainMenu;

public class MainMenuController {

    private final MainMenu view;

    public MainMenuController() {
        this.view = new MainMenu();
        initButtonsActions();
    }

    private void initButtonsActions() {
        view.getPlayButton().setOnAction(e -> {
            System.out.println("lancement");
            // TODO: appeler le SceneManager pour lancer le jeu
        });

        view.getSettingsButton().setOnAction(e -> {
            SceneManager.showSettings();
        });

        view.getExitButton().setOnAction(e -> {
            System.exit(0);
        });
    }

    public Parent getRoot() {
        return view.getRoot();
    }
}
