package ru.gilyazov.pagetopage_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.gilyazov.pagetopage_task1.util.Manager.showChesScene;
import static ru.gilyazov.pagetopage_task1.util.Manager.showSecondScene;

public class five {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private Button reg1;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("begyn-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("two.fxml","Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void reg1(ActionEvent event) {
        showChesScene("six.fxml","Marathon Skills 2016 – Registration confirmation");

    }

}
