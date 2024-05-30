package com.aip.lab18;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("chat.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 206, 308);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        
    }

    public static void main(String[] args) {
        launch();
    }
}