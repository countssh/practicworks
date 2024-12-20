package ru.gilyazov.gilyazov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int K = Integer.parseInt(kTextField.getText().toString());
        if (K >= 1 && K <= 365) {
            int start = 3;
            int d = (start + (K - 1)) % 7;

            if (d == 0) {
                d = 7;
            }
            resultLabel.setText("Номер дня недели: " + d);

        } else {
            resultLabel.setText("Ошибка");
        }
    }
}
