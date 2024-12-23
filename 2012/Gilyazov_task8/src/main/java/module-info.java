module ru.davydov.davydov_task8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task8 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task8;
}