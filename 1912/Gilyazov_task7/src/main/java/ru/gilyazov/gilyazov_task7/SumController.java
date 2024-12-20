package ru.gilyazov.gilyazov_task7;

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
    void startButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(aTextField.getText().toString());

        if (n < 1 || n > 999) {
            resultLabel.setText("Ошибка: число вне диапазона");
        } else {
            String s = n % 2 == 0 ? "Четное " : "Нечетное ";
            String p = n < 10 ? "однозначное" : n < 100 ? "двузначное" : "трехзначное";
            resultLabel.setText(s + p + " число");
        }
    }
}
