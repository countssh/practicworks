package ru.gilyazov.gilyazov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField god;

    @FXML
    private Label resultLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int God = Integer.parseInt(god.getText().toString());
        int stol;
        if (God % 100 == 0) {
            stol = God / 100;
        } else {
            stol = God / 100 + 1;
        }
        resultLabel.setText("Номер столетия: " + stol);
    }
}
