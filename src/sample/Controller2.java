

package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Node;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.image.Image;
        import javafx.stage.Stage;

        import java.io.IOException;

public class Controller2 {
    private Data dato = Data.getDatos().get(Data.getContador());

    @FXML
    private Button btNext;

    @FXML
    private Button btCheck;

    @FXML
    private Label texto1;

    @FXML
    private Label labelPregunta;

    @FXML
    private TextField tfRespuesta;

    @FXML
    public void initialize() {
        labelPregunta.setText(dato.getTitulo());
    }

    @FXML
    void anterior(ActionEvent event) {

    }

    @FXML
    void next(ActionEvent event) throws IOException {
        System.out.println(Data.getContador());
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Pantallas/ejemplo.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Data.sumarContador();
    }
    @FXML
    void checkAnswer(ActionEvent event) {
        if(tfRespuesta.getText().equals(dato.getRespuesta())){
            texto1.setText("Correcto!!");
        }else{
            texto1.setText("Incorrecto");
        }
    }

}