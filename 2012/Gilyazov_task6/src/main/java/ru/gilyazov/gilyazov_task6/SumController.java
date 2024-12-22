package ru.gilyazov.gilyazov_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button startButton;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(aTextField.getText().toString());

        if (n <= 0) {
            System.out.println("N должно быть больше 0.");
            return;
        }

        boolean ok = false;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                ok = true;
                break;
            }
            n /= 10;
        }
        resultLabel.setText(String.valueOf(ok));
    }
}
