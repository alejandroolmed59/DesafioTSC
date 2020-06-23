package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.*;

public class Pantalla2 {

    public static void display(Image img){
        Button button;
        Stage window= new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Paso 2");
        Label label= new Label();
        label.setText("Hey there");

        button = new Button();
        button.setText("Bye");
        button.setOnAction(event -> {
            window.close();
        });
        ImageView iv = new ImageView();
        iv.setFitHeight(300);
        iv.setFitWidth(300);
        iv.setImage(img);

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(iv , label, button);
        window.setScene(new Scene(layout, 1920,1080));
        window.show();
    }
}
