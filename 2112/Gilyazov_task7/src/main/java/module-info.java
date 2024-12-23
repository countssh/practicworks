module ru.davydov.davydov_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task7 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task7;
}