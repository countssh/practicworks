package ru.gilyazov.gilyazov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText().toString());
        int s = n % 60;
        resultLabel.setText("Кол-во секунд с начала последней минуты: " + s);
    }
}
