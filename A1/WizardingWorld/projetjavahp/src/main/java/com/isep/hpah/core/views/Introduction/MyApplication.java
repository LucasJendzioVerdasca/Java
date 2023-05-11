package com.isep.hpah.core.views.Introduction;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MyApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                MyApplication.class.getResource("/com/isep/hpah/core/scenes/Introduction/Intro.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 590, 285);
        stage.setTitle("Harry Potter at Home !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}