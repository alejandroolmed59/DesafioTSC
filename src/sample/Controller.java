package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.annotation.Resources;
import java.io.IOException;
import java.net.URL;
import java.sql.Time;
import java.util.List;

public class Controller {
    List<Data> lista = Data.getDatos();
    //private int contador=Data.getContador();
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
    public void initialize() {
        System.out.println(Data.getContador());
        fadear(texto1, 1.5);
        fadear(Img1, 2.5);
        rotar(btsiguiente, 360);

        System.out.println(lista.get(Data.getContador()).getImgUrl());
        Image img = new Image(this.getClass().getResourceAsStream(lista.get(Data.getContador()).getImgUrl()));
        texto1.setText(lista.get(Data.getContador()).getTitulo());
        Img1.setImage(img);
    }

    @FXML
    void siguiente(ActionEvent event) throws Exception {
        fadear(texto1, 1.5);
        fadear(Img1, 2.5);
        rotar(btsiguiente, 360);
        if(Data.getContador()<lista.size()-1) Data.sumarContador();;
        System.out.println(Data.getContador());
        if(Data.getContador()==4){
            cambiarStage(event);
            return;
        }
        System.out.println(lista.get(Data.getContador()).getImgUrl());
        Image img = new Image(this.getClass().getResourceAsStream(lista.get(Data.getContador()).getImgUrl()));
        texto1.setText(lista.get(Data.getContador()).getTitulo());
        Img1.setImage(img);

    }
    @FXML
    void anterior(ActionEvent event) throws IOException {
        fadear(texto1, 1.5);
        fadear(Img1, 2.5);
        rotar(btanterior, -360);
        Data.restarContador();
       if(Data.getContador()<0) Data.setContador(0);
       if(Data.getContador()==4){
           cambiarStage(event);
           return;
       }
        System.out.println(Data.getContador());
        Image img = new Image(this.getClass().getResourceAsStream(lista.get(Data.getContador()).getImgUrl()));
        texto1.setText(lista.get(Data.getContador()).getTitulo());
        Img1.setImage(img);
    }
    private void rotar(Node btn, int angle){
        RotateTransition rt = new RotateTransition(Duration.seconds(1), btn);
        rt.setAutoReverse(true);
        rt.setByAngle(angle);
        rt.setDelay(Duration.seconds(0));
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
    private void cambiarStage(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Pantallas/pregunta.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Data.sumarContador();
    }
}
