package upc.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainMenu {
    private final VBox root;
    private final Button playButton;
    private final Button settingsButton;
    private final Button exitButton;

    public MainMenu() {
        root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));

        root.setStyle("-fx-background-color: #2f3640;");

        Label title = new Label("ColonyGlorb");
        title.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: white;");

        playButton = new Button("Jouer");
        playButton.setPrefWidth(220);
        playButton.setPrefHeight(40);

        settingsButton = new Button("Paramètres");
        settingsButton.setPrefWidth(220);
        settingsButton.setPrefHeight(40);

        exitButton = new Button("Quitter");
        exitButton.setPrefWidth(220);
        exitButton.setPrefHeight(40);

        root.getChildren().addAll(title, playButton, settingsButton, exitButton);
    }

    public Parent getRoot() {
        return root;
    }

    public Button getPlayButton() {
        return playButton;
    }

    public Button getSettingsButton() {
        return settingsButton;
    }

    public Button getExitButton() {
        return exitButton;
    }
}
