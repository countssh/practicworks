module ru.davydov.davydov_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task6 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task6;
}