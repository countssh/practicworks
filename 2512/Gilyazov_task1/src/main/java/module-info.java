module ru.gilyazov.gilyazov_task {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.gilyazov_task1 to javafx.fxml;
    exports ru.gilyazov.gilyazov_task1;
    exports ru.gilyazov.gilyazov_task1.controller;
    opens ru.gilyazov.gilyazov_task1.controller to javafx.fxml;
}