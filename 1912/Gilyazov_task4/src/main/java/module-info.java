module ru.gilyazov.gilyazov_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task4 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task4;
}