package ru.gilyazov.gilyazov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NumberTextField;

    @FXML
    private TextField ValueTextField;

    @FXML
    private Label aLabel;

    @FXML
    private Label cLabel;

    @FXML
    private Button calculateButton;

    @FXML
    private Label hLabel;

    @FXML
    private Label sLabel;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(NumberTextField.getText().toString());
        double v = Double.parseDouble(ValueTextField.getText().toString());

        if (n < 1 || n > 4) {
            calculateButton.setText("Номер элемента должен быть от 1 до 4.");
            return;
        }

        double a, c, h, s;
        switch (n) {
            case 1:
                a = v;
                c = a * Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 2:
                c = v;
                a = c / Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 3:
                h = v;
                c = 2 * h;
                a = c / Math.sqrt(2);
                s = c * h / 2;
                break;
            case 4:
                s = v;
                c = Math.sqrt(4 * s);
                a = c / Math.sqrt(2);
                h = c / 2;
                break;
            default:
                return;
        }

        aLabel.setText("a = " + String.format("%.3f", a));
        cLabel.setText("c = " + String.format("%.3f", c));
        hLabel.setText("h = " + String.format("%.3f", h));
        sLabel.setText("S = " + String.format("%.3f", s));
    }
}

