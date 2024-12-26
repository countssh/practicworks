module ru.staroverov.staroverov_primer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.gilyazov.gilyazov_example to javafx.fxml;
    exports ru.gilyazov.gilyazov_example;
    exports ru.gilyazov.gilyazov_example.controller;
    opens ru.gilyazov.gilyazov_example.controller to javafx.fxml;
}