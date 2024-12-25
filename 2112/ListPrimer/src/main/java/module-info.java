module ru.gilyazov.listprimer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gilyazov.listprimer to javafx.fxml;
    exports ru.gilyazov.listprimer;
}