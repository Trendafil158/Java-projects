module gui {

    requires javafx.fxml;
    requires javafx.controls;

    opens login to javafx.fxml;
    exports login to javafx.graphics;

    requires validation;
}