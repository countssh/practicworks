package ru.gilyazov.gilyazov_task6;

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

        if (n == 0) {
            resultLabel.setText("Нулевое число");
        } else {
            String s = n < 0 ? "Отрицательное " : "Положительное ";
            String p = n % 2 == 0 ? "четное число" : "нечетное число";
            resultLabel.setText(s + p);
        }
    }
}