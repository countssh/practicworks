package ru.gilyazov.gilyazov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        float b = Float.parseFloat(bTextField.getText().toString());

        if (a > b) {
            float r = a % b;
            resultLabel.setText("Длина незанятой части отрезка: " + String.format("%.3f", r));
        } else {
            resultLabel.setText("Ошибка: убедитесь, что A > B и оба числа положительные.");
        }
    }
}

