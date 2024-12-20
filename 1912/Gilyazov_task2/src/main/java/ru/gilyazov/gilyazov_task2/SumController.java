package ru.gilyazov.gilyazov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField bTF;

    @FXML
    private TextField cTF;

    @FXML
    private Label resultLabel;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aTF.getText().toString());
        int b = Integer.parseInt(bTF.getText().toString());
        int c = Integer.parseInt(cTF.getText().toString());

        int PC = 0;
        int NC = 0;

        if (a > 0) PC++;
        else if (a < 0) NC++;

        if (b > 0) PC++;
        else if (b < 0) NC++;

        if (c > 0) PC++;
        else if (c < 0) NC++;

        resultLabel.setText("Кол-во пол. чисел: " + PC + "  Кол-во отр. чисел: " + NC);
    }
}
