package ru.gilyazov.pagetopage_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gilyazov.pagetopage_task1.util.Manager.*;

public class two {

    @FXML
    private Button BackB;

    @FXML
    private Button Login;

    @FXML
    private Button NewB;

    @FXML
    private Button OldB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("begyn-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void Login(ActionEvent event) {
        showTriScene("three.fxml","Marathon Skills 2016 - Login");

    }

    @FXML
    void NewB(ActionEvent event) {
        showChScene("four.fxml","Marathon Skills 2016 – Register as a runner");

    }

    @FXML
    void OldB(ActionEvent event) {
        showTriScene("three.fxml","Marathon Skills 2016 - Login");

    }

}
