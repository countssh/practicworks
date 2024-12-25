package ru.gilyazov.gilyazov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private TextArea resultTextArea;

    @FXML
    private Button startButton;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        try {
            double pricePerKg = Double.parseDouble(aTextField.getText());
            if (pricePerKg < 0) {
                startButton.setText("Цена должна быть неотрицательной");
                resultTextArea.clear();
                return;
            }

            double weight = 1.2;
            String result = "";

            while (weight <= 2.0) {
                double totalCost = pricePerKg * weight;
                result += String.format("Стоимость %.1f кг: %.2f\n", weight, totalCost);
                weight += 0.2;
            }
            resultTextArea.setText(result);

        } catch (NumberFormatException e) {
            startButton.setText("Введите корректное число");
            resultTextArea.clear();
        }
    }
}
