package ru.gilyazov.gilyazov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gilyazov.gilyazov_task1.util.Manager.showSecondScene;

public class six {

    @FXML
    private Button bButton;
    @FXML
    private Button backButton;

    @FXML
    private Button logoutButton;

    @FXML
    void backButton(ActionEvent event) {
        showSecondScene("begyn-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void bButton(ActionEvent event) {
        showSecondScene("begyn-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void logButtonOnAction(ActionEvent event) {
        showSecondScene("begyn-view.fxml", "Marathon Skills 2016");
    }
}
