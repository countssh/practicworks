package ru.gilyazov.gilyazov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class SumController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField bTF;

    @FXML
    private TextField mTF;

    @FXML
    private Label resultLabel;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        double a = Integer.parseInt(aTF.getText().toString());
        double b = Integer.parseInt(bTF.getText().toString());
        double m = Integer.parseInt(mTF.getText().toString());

        double x = a * b * b - sin(b * b) + m * b;

        double y;
        if (x < -PI) {
            y = 1 - (exp(-a * x) + exp(-b * x));
        } else if (x > PI) {
            y = 1 - exp(-a * x) * sin(a * x + b);
        } else {
            y = 1 - exp(-a * x) * (a * x + b);
        }
        resultLabel.setText("Y = " + String.format("%.3f", y) + "  X = " + String.format("%.3f", x));
    }
}
