package ru.gilyazov.gilyazov_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button startButton;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        try {
            int n = Integer.parseInt(nTextField.getText());
            int k = Integer.parseInt(kTextField.getText());

            if (n <= 0 || k <= 0) {
                resultLabel.setText("N и K должны быть положительными");
                return;
            }

            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(i, k);
            }

            resultLabel.setText(String.format("%.3f", sum));

        } catch (NumberFormatException e) {
            resultLabel.setText("Некорректный ввод");
        }
    }
}