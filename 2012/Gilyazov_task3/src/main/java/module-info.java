module ru.gilyazov.gilyazov_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task3 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task3;
}