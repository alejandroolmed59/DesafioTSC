package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    //Button button;
    //Image img2 = new Image(getClass().getResourceAsStream("/sample/Images/2.jpg"));

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox mainVbox = FXMLLoader.load(getClass().getResource("Pantallas/ejemplo.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(mainVbox));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
