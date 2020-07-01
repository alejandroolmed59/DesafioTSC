package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.Time;
import java.util.List;

public class Controller {
    List<Data> lista = Data.getDatos();
    private int contador=0;
    @FXML
    private Button btsiguiente;
    @FXML
    private ImageView Img1;
    @FXML
    private VBox rootPanel;
    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private Button btanterior;

    @FXML
    private Label texto1;

    @FXML
    void siguiente(ActionEvent event) throws Exception {
        fadear(texto1, 1.5);
        fadear(Img1, 2.5);
        rotar(btsiguiente, 360);

        if(contador<lista.size()-1) contador++;
        System.out.println(lista.get(contador).getImgUrl());
        Image img = new Image(this.getClass().getResourceAsStream(lista.get(contador).getImgUrl()));
        texto1.setText(lista.get(contador).getTitulo());
        Img1.setImage(img);

    }
    @FXML
    void anterior(ActionEvent event) {
        fadear(texto1, 1.5);
        fadear(Img1, 2.5);
        rotar(btanterior, -360);
        contador--;
        if(contador<0) contador=0;
        Image img = new Image(this.getClass().getResourceAsStream(lista.get(contador).getImgUrl()));
        texto1.setText(lista.get(contador).getTitulo());
        Img1.setImage(img);
    }
    private void rotar(Node btn, int angle){
        RotateTransition rt = new RotateTransition(Duration.seconds(1), btn);
        rt.setAutoReverse(true);
        rt.setByAngle(angle);
        rt.setDelay(Duration.seconds(0));
      //  rt.setRate(2);
       // rt.setCycleCount(18);
        rt.play();
    }
    private void fadear(Node elemento, double duracion){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.1), elemento);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.setDuration(Duration.seconds(duracion));
        fadeTransition.setCycleCount(1);
        fadeTransition.play();
    }
}
