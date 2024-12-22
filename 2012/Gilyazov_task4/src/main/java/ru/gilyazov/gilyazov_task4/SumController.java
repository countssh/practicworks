package ru.gilyazov.gilyazov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(aTextField.getText().toString());

        if (n <= 0) {
            resultLabel.setText("N должно быть положительным числом");
            return;
        }

        int k = 0;

        while (n > 1) {
            if (n % 2 != 0) {
                resultLabel.setText("Введенное число не является степенью двойки");
                return;
            }
            n /= 2;
            k++;
        }
        resultLabel.setText("K = " + k);
    }
}
