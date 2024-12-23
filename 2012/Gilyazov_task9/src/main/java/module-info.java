module ru.davydov.davydov_task9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task9 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task9;
}