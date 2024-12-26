package ru.gilyazov.gilyazov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gilyazov.gilyazov_task1.util.Manager.*;

public class two {

    @FXML
    private Button backButton;

    @FXML
    private Button Login;

    @FXML
    private Button newButton;

    @FXML
    private Button oldButton;

    @FXML
    private Button logoutButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondScene("begyn-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void Login(ActionEvent event) {
        showTriScene("three.fxml", "Marathon Skills 2016 - Login");

    }

    @FXML
    void newButtonOnAction(ActionEvent event) {
        showChScene("four.fxml", "Marathon Skills 2016 – Register as a runner");

    }

    @FXML
    void OldButtonOnAction(ActionEvent event) {
        showTriScene("three.fxml", "Marathon Skills 2016 - Login");
    }

    @FXML
    void logButtonOnAction(ActionEvent event) {
        showSecondScene("begyn-view.fxml", "Marathon Skills 2016");
    }
}


