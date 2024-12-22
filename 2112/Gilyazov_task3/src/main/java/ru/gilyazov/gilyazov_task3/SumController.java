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

            StringBuilder output = new StringBuilder();
            DecimalFormat df = new DecimalFormat("0.00"); // Для форматирования до 2 знаков после запятой
            double totalCost;

            for (double weight = 1.2; weight <= 2.0; weight += 0.2) {
                totalCost = pricePerKg * weight;
                output.append("Стоимость ").append(df.format(weight)).append(" кг: ").append(df.format(totalCost)).append(" \n");
            }
            resultTextArea.setText(output.toString());

        } catch (NumberFormatException e) {
            startButton.setText("Введите корректное число");
            resultTextArea.clear();
        }
    }
}

