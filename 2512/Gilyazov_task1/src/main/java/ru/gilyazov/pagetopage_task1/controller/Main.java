package ru.gilyazov.pagetopage_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gilyazov.pagetopage_task1.util.Manager.showSecondScene;

public class Main {

    @FXML
    private Button BackButton;

    @FXML
    private Button Login;

    @FXML
    private Button wanna;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("begyn-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void Login(ActionEvent event) {
        showSecondScene("two.fxml","Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void wanna(ActionEvent event) {
        showSecondScene("two.fxml","Marathon Skills 2016 - Register as a runner");

    }

}