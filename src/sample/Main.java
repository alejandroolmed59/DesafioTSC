package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

public class Main extends Application{
    //Button button;
    //Image img2 = new Image(getClass().getResourceAsStream("/sample/Images/2.jpg"));

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox mainVbox = FXMLLoader.load(getClass().getResource("ejemplo.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(mainVbox));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
