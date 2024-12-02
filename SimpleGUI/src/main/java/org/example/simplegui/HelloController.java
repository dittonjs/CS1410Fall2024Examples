package org.example.simplegui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    private int count = 0;

    @FXML
    private Label counterDisplay;

    @FXML
    public void incrementCount() {
        count ++;
        counterDisplay.setText(String.valueOf(count));
        Labe
    }
}