package com.aip.lab18;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Objects;

public class HelloController {
    @FXML
    public TextField input1;
    @FXML
    public Button button1;
    @FXML
    public TextArea area;

    @FXML
    void onButton () {
        if (Objects.equals(input1.getText(), ""))
            return;
        area.setText(area.getText() + "Your message: " + input1.getText() + '\n');
        input1.setText("");
        input1.requestFocus();
    }

    public void onEnter(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER)
            onButton();
    }
}