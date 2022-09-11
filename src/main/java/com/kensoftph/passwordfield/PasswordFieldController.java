package com.kensoftph.passwordfield;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PasswordFieldController implements Initializable {

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label shownPassword;

    @FXML
    private ToggleButton toggleButton;

    @FXML
    void passwordFieldKeyTyped(KeyEvent event) {
        shownPassword.textProperty().bind(Bindings.concat(passwordField.getText()));
    }

    @FXML
    void toggleButton(ActionEvent event) {
        if (toggleButton.isSelected()) {
            shownPassword.setVisible(true);
            shownPassword.textProperty().bind(Bindings.concat(passwordField.getText()));
            toggleButton.setText("Hide");
        }else{
            shownPassword.setVisible(false);
            toggleButton.setText("Show");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shownPassword.setVisible(false);
    }
}