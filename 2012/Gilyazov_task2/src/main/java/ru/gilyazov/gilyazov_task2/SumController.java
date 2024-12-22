package ru.gilyazov.gilyazov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField mTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());
        int M = Integer.parseInt(mTextField.getText().toString());

        String A = "";
        String B = "";

        switch (N) {
            case 6: A = "шестерка"; break;
            case 7: A = "семерка"; break;
            case 8: A = "восьмерка"; break;
            case 9: A = "девятка"; break;
            case 10: A = "десятка"; break;
            case 11: A = "валет"; break;
            case 12: A = "дама"; break;
            case 13: A = "король"; break;
            case 14: A = "туз"; break;
            default: resultLabel.setText("Неизвестное достоинство");
            return;
        }
        switch (M) {
            case 1: B = "пики"; break;
            case 2: B = "треф"; break;
            case 3: B = "бубен"; break;
            case 4: B = "червей"; break;
            default: resultLabel.setText("Неизвестная масть");
            return;
        }
        resultLabel.setText(A + " " + B);
    }
}
