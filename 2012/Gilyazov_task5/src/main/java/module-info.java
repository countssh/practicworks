module ru.gilyazov.gilyazov_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task5 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task5;
}