package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Controller {
    private int contador=1;
    @FXML
    private Button but1;
    @FXML
    private ImageView Img1;
    @FXML
    private VBox rootPanel;
    @FXML
    private BorderPane mainBorderPane;

    @FXML
    void nextPage(ActionEvent event) throws Exception {
        contador++;
        System.out.println(contador);
        //VBox sc2 = FXMLLoader.load(getClass().getResource("pag2.fxml"));
        Image img = new Image(this.getClass().getResourceAsStream("/sample/Images/"+contador+".png"));
        Img1.setImage(img);
        //mainBorderPane.setCenter(sc2);
    }


}
