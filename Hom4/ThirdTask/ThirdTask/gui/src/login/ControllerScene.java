package login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ClassesForValidation.EmailValidator;
import ClassesForValidation.PasswordValidator;
import ClassesForValidation.PhoneValidator;
import ClassesForValidation.UserNameValidator;

public class ControllerScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancel;

    @FXML
    private Button brtnValidate;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtConfirmPassword;

    @FXML
    private Label lblUserLabel;

    @FXML
    private Label lblPhone;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblConfirmPassword;

    @FXML
    void btnCancelOnAction(ActionEvent event) {

        Platform.exit();

    }

    @FXML
    void btnValidateOnAction(ActionEvent event) {


        if(!UserNameValidator.isValid(txtUserName.getText()))
        {
            lblUserLabel.setText("Incorrect Username!");
        }
        else if(!PhoneValidator.isValid(txtPhone.getText()))
        {
            lblPhone.setText("Incorrect Phone!");
        }
        else if(!EmailValidator.isValid(txtEmail.getText()))
        {
            lblEmail.setText("Incorrect email!");
        }
        else if(!PasswordValidator.isValid(txtPassword.getText()))
        {
            lblPassword.setText("Incorrect Password!");
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successful");
        alert.setHeaderText("Everything is good!");
        alert.setContentText(null);
        alert.showAndWait();


    }

    @FXML
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'Scene.fxml'.";
        assert brtnValidate != null : "fx:id=\"brtnValidate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtUserName != null : "fx:id=\"txtUserName\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblUserLabel != null : "fx:id=\"lblUserLabel\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblPhone != null : "fx:id=\"lblPhone\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblPassword != null : "fx:id=\"lblPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblConfirmPassword != null : "fx:id=\"lblConfirmPassword\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

