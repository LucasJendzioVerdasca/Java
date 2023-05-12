package com.isep.hpah.core.views.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Introcontroller {

    @FXML
    private Button continueButton;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameInput;

    @FXML
    private VBox formBox;

    @FXML
    public void initialize() {
        formBox.setVisible(false);
    }

    @FXML
    protected void onContinueButtonClick(ActionEvent event) {
        continueButton.setVisible(false);
        formBox.setVisible(true);
    }
}
