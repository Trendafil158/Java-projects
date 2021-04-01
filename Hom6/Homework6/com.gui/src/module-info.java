module com.gui {

      requires javafx.fxml;
      requires javafx.controls;

      opens com.graphics to javafx.fxml;
      exports com.graphics to javafx.graphics;

      requires com.providers;
      requires com.services;

}