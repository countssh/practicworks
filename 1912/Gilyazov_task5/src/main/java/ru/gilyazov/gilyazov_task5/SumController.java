package ru.gilyazov.gilyazov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class SumController {

    @FXML
    private Label result;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextFIeld;

    @FXML
    void BtnOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double y = Double.parseDouble(yTextFIeld.getText().toString());

            if (pow(x, 2) + pow(y, 2) == 144 || y == x) {
                result.setText("На границе");
            } else if (y < x && pow(x,2) + pow(y,2) < 144){
                result.setText("Да");
            }else {
            result.setText("Нет");
        }
    }
}
