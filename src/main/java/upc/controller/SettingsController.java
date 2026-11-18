package upc.controller;

import javafx.scene.Parent;
import upc.utils.SceneManager;
import upc.view.Settings;

public class SettingsController {

    private final Settings view;

    public SettingsController() {
        this.view = new Settings();
        view.getFullScreen().setSelected(SceneManager.isFullScreen());
        initButtonsActions();
    }

    private void initButtonsActions() {
        view.getBackButton().setOnAction(e -> {
            SceneManager.showMainMenu();
        });

        view.getFullScreen().setOnAction(e -> {
            boolean isFullScreen = view.getFullScreen().isSelected();
            SceneManager.setFullScreen(isFullScreen);
        });
    }

    public Parent getRoot() {
        return view.getRoot();
    }
}
