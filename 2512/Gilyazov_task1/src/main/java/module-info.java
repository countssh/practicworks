module ru.staroverov.staroverov_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.pagetopage_task1 to javafx.fxml;
    exports ru.gilyazov.pagetopage_task1;
    exports ru.gilyazov.pagetopage_task1.controller;
    opens ru.gilyazov.pagetopage_task1.controller to javafx.fxml;
}