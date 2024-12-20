package ru.gilyazov.gilyazov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField bTF;

    @FXML
    private TextField cTF;

    @FXML
    private Label resultLabel;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aTF.getText().toString());
        int b = Integer.parseInt(bTF.getText().toString());
        int c = Integer.parseInt(cTF.getText().toString());

        int sum = (a + b + c) - Math.min(a, Math.min(b, c));

        resultLabel.setText("Сумма двух наибольших чисел: " + sum);
    }
}
