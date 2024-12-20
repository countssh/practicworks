package ru.gilyazov.gilyazov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float A = Float.parseFloat(ATextField.getText().toString());
        float B = Float.parseFloat(BTextField.getText().toString());
        float C = Float.parseFloat(CTextField.getText().toString());

        if ((C > A && C < B) || (C < A && C > B)) {

            double AC = Math.abs(A - C);
            double BC = Math.abs(B - C);
            double P = AC * BC;

            resultLabel.setText("Произведение длин отрезков AC и BC = " + P);
        } else {
            resultLabel.setText("Точка C должна находиться между точками A и B");
        }
    }
}
