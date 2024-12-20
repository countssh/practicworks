package ru.gilyazov.gilyazov_task5;

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
    private TextField xTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        float x = Float.parseFloat(xTextField.getText().toString());

        if (Math.cos(x) == 0) {
            return;
        }

        if (Math.tan(x / 2) == 0) {
            return;
        }

        if (a * Math.pow(x, 3) + 2 < 0) {
            return;
        }

        double p = (1 / Math.cos(x)) + Math.log(Math.abs(Math.tan(x / 2))) + (x / (1 + (x / (1 + x))));

        double alpha = (Math.pow(p, 5) * Math.sqrt(a * Math.pow(x, 3) + 2)) / (2 * Math.cos(x));

        resultLabel.setText("При p = " + String.format("%.3f", p) + "  a = " + String.format("%.3f", alpha));
    }
}
