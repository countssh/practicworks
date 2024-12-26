package ru.gilyazov.pagetopage_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gilyazov.pagetopage_task1.util.Manager.showSecondScene;

public class six {

    @FXML
    private Button BackB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("begyn-view.fxml","Marathon Skills 2016");

    }

}
