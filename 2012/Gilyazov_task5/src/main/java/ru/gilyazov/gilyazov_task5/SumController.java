package ru.gilyazov.gilyazov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Label resultLabel1;

    @FXML
    private Button startButton;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(aTextField.getText().toString());

        if (n <= 1) {
            startButton.setText("N должно быть больше 1.");
            return;
        }
        int k = 0;
        int sum = 0;

        while (true) {
            k++;
            sum += k;

            if (sum > n) {
                sum -= k;
                k--;
                break;
            }
        }
        resultLabel.setText("Наибольшее K: " + k);
        resultLabel1.setText("Сумма 1 + 2 + ... + K:  " + sum);
    }
}


