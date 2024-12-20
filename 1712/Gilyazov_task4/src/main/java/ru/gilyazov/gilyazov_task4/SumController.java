package ru.gilyazov.gilyazov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField T1TextField;

    @FXML
    private TextField T2TextField;

    @FXML
    private TextField UTextField;

    @FXML
    private TextField VTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float U = Float.parseFloat(UTextField.getText().toString());
        float V = Float.parseFloat(VTextField.getText().toString());
        float T1 = Float.parseFloat(T1TextField.getText().toString());
        float T2 = Float.parseFloat(T2TextField.getText().toString());

        if (U < V) {
            double S = (T1 * V) + (T2 * (V - U));
            resultLabel.setText("Общий путь, пройденный лодкой (S) = " + S + " км");
        } else {
            resultLabel.setText("Ошибка: скорость течения должна быть меньше скорости лодки в стоячей воде");
        }
    }
}
