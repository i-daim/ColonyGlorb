package upc.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Settings {

    private final VBox root;
    private final CheckBox fullScreen;
    private final Button backButton;

    public Settings() {
        root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));

        root.setStyle("-fx-background-color: #2f3640;");

        Label title = new Label("Paramètres");
        title.setStyle("-fx-font-size: 36px; -fx-font-weight: bold;-fx-text-fill: white;");

        fullScreen = new CheckBox("Mode plein écran");
        fullScreen.setStyle("-fx-text-fill: white;");
        backButton = new Button("Retour au menu");
        backButton.setPrefWidth(220);
        backButton.setPrefHeight(40);

        root.getChildren().addAll(title, fullScreen, backButton);
    }

    public Parent getRoot() {
        return root;
    }

    public CheckBox getFullScreen() {
        return fullScreen;
    }

    public Button getBackButton() {
        return backButton;
    }
}
