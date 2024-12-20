package ru.gilyazov.gilyazov_task1;

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

        if (n >= 10 && n <= 99) {
            resultLabel.setText("Цифры одинаковые: " + ((n / 10) == (n % 10) ? "Да" : "Нет"));
        } else {
            resultLabel.setText("Ошибка: введите двузначное число");
        }
    }
}








