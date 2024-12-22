package ru.gilyazov.gilyazov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        int NN = Integer.parseInt(nTextField.getText().toString());
        double AA = Double.parseDouble(aTextField.getText().toString());
        double BB = Double.parseDouble(bTextField.getText().toString());

        switch (NN) {

            case 1:
                resultLabel.setText("Результат: " + (AA + BB));
                break;

            case 2:
                resultLabel.setText("Результат: " + (AA - BB));
                break;

            case 3:
                resultLabel.setText("Результат: " + (AA * BB));
                break;

            case 4:
                if (BB != 0) resultLabel.setText("Результат: " + (AA / BB));
                else resultLabel.setText("Деление на ноль невозможно");
                break;

            default:
                resultLabel.setText("Некорректный номер действия");
                break;
        }
    }
}
