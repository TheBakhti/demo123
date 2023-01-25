package com.example.demo123;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button byeButton;
    @FXML
    private Button helloButton;
    @FXML
    private TextField nameField;
    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    @FXML
    protected void onHelloButtonClick(ActionEvent e) {
        if(e.getSource().equals(helloButton)){
           welcomeText.setText("Hello "+nameField.getText());
        } else if (e.getSource().equals(byeButton)) {
            welcomeText.setText("Bye "+nameField.getText());
        }
    }
    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
}