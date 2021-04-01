package com.graphics;

import java.net.URL;
import java.util.ResourceBundle;

import com.provider.CipherGenerator;
import com.provider.Result;
import com.provider.Wrapper;
import com.service.Cipherable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RandomLettersController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtSeed;

    @FXML
    private TextField txtSize;

    @FXML
    private Button btnGenerateRandom;

    @FXML
    private Button btnRandomSubset;

    @FXML
    private Button btnQuit;

    @FXML
    void btnOnActionGenerateRandom(ActionEvent event) {

        int sizeText = Integer.parseInt(txtSize.getText());
        Wrapper wrapper = new Wrapper(sizeText);
        Cipherable cipherable = wrapper.makeFixedRandom();
        int seedText = Integer.parseInt(txtSeed.getText());
        char[] letters = cipherable.getSecretChars(seedText);

        String result = "";
        for(int i = 0; i < letters.length; i++)
        {
            result += letters[i] + ", ";
        }

        Result resultForUniqueLetters = CipherGenerator.countDistinct(cipherable, seedText);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Random subsequence of letters A-Z");
        alert.setHeaderText("Chars: " + "["+result+"]" + "\n" + "Result: " + resultForUniqueLetters.getData());
        alert.setContentText(null);
        alert.showAndWait();
    }

    @FXML
    void btnOnActionQuit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnOnActionRandomSubset(ActionEvent event) {

        int sizeText = Integer.parseInt(txtSize.getText());
        Wrapper wrapper = new Wrapper(sizeText);
        Cipherable cipherable = wrapper.makeFixedSelection();

        int seedText = Integer.parseInt(txtSeed.getText());
        char[] letters = cipherable.getSecretChars(seedText);

        String result = "";
        for(int i = 0; i < letters.length; i++)
        {
            result += letters[i] + ", ";
        }

        Result resultForUniqueness = CipherGenerator.countDistinct(cipherable, seedText);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Generate random subset A-Z");
        alert.setHeaderText("CharsL " + "["+result+"]" + "\n" + "Result: " + resultForUniqueness.getData());
        alert.setContentText(null);
        alert.showAndWait();
    }

    @FXML
    void initialize() {
        assert txtSeed != null : "fx:id=\"txtSeed\" was not injected: check your FXML file 'RandomLetters.fxml'.";
        assert txtSize != null : "fx:id=\"txtSize\" was not injected: check your FXML file 'RandomLetters.fxml'.";
        assert btnGenerateRandom != null : "fx:id=\"btnGenerateRandom\" was not injected: check your FXML file 'RandomLetters.fxml'.";
        assert btnRandomSubset != null : "fx:id=\"btnRandomSubset\" was not injected: check your FXML file 'RandomLetters.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'RandomLetters.fxml'.";

    }
}

