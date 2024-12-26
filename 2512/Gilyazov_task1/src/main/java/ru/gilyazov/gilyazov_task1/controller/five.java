package ru.gilyazov.gilyazov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gilyazov.gilyazov_task1.util.Manager.showSecondStage;

public class five {

    @FXML
    private Button backButton;

    @FXML
    private Button Cancel;

    @FXML
    private Button register;

    @FXML
    private Button logoutButton;

    @FXML
    void backButton(ActionEvent event) {
        showSecondStage("begyn-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondStage("two.fxml", "Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void regButtonOnAction(ActionEvent event) {
        showSecondStage("six.fxml", "Marathon Skills 2016 – Registration confirmation");
    }

    @FXML
    void logButtonOnAction(ActionEvent event) {

        showSecondStage("begyn-view.fxml", "Marathon Skills 2016");
    }
}
