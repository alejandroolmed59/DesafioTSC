package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox mainVbox = FXMLLoader.load(getClass().getResource("Pantallas/ejemplo.fxml"));
        primaryStage.setTitle("Desafio de programacion");
        primaryStage.setScene(new Scene(mainVbox));
        primaryStage.getIcons().add(new Image("/sample/Images/Practitioner.png"));
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
