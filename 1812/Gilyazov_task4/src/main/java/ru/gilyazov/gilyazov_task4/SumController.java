package ru.gilyazov.gilyazov_task4;

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
    private TextField cTextField;


    @FXML
    private Label resultLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(aTextField.getText().toString());
        int B = Integer.parseInt(aTextField.getText().toString());
        int C = Integer.parseInt(aTextField.getText().toString());
        int KolKvPoDline = A / C;
        int KolKVPoShirine = B / C;
        int VsegoKv = KolKvPoDline * KolKVPoShirine;
        int PlosPryam = A * B;
        int PlosKv = VsegoKv * (C * C);
        int FreePlos = PlosPryam - PlosKv;
        resultLabel.setText("Кол-во квадратов: " + VsegoKv + " Площадь незанятой части: " + FreePlos);
    }
}
