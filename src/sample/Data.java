package sample;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private String imgUrl;
    private String titulo;

    public Data(String imgUrl, String titulo) {
        this.imgUrl = imgUrl;
        this.titulo = titulo;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static List<Data> getDatos(){
        List<Data> lista= new ArrayList<>();
        lista.add(new Data("/sample/Images/bienvenido.jpg", "Bienvenido!"));
        lista.add(new Data("/sample/Images/dominio.jpg", "Dominio"));
        lista.add(new Data("/sample/Images/dominio2.jpg", "Dominio (2do angulo)"));
        lista.add(new Data("/sample/Images/malla.jpg", "La malla!"));
        lista.add(new Data("/sample/Images/tablacon.jpg", "La tabla de conectividades!"));
        lista.add(new Data("/sample/Images/modelo.jpg", "El modelo"));
        lista.add(new Data("/sample/Images/mef.jpg", "Metodo de los elementos finitos"));
        lista.add(new Data("/sample/Images/paso1.jpg", "Paso 1"));
        lista.add(new Data("/sample/Images/paso2.jpg", "Paso 2"));
        lista.add(new Data("/sample/Images/paso3.jpg", "Paso 3"));
        lista.add(new Data("/sample/Images/paso4.jpg", "Paso 4"));
        lista.add(new Data("/sample/Images/paso5.jpg", "Paso 5"));
        lista.add(new Data("/sample/Images/paso6D.jpg", "Paso 6 - Matriz D"));
        lista.add(new Data("/sample/Images/paso6E.jpg", "Paso 6 - Matriz E"));
        lista.add(new Data("/sample/Images/definiendo/recordar.jpg", "Recordar que..."));
        lista.add(new Data("/sample/Images/definiendo/defC1.jpg", "DEFINIENDO LOS COMPONENTES - Matriz C"));
        lista.add(new Data("/sample/Images/definiendo/defC2.jpg", "Matriz C"));
        lista.add(new Data("/sample/Images/definiendo/defC3.jpg", "Matriz C - Integrando y definiendo"));
        lista.add(new Data("/sample/Images/definiendo/defG1.jpg", "Matriz G"));
        lista.add(new Data("/sample/Images/definiendo/defG2.jpg", "Matriz G - Integrando y definiendo"));
        lista.add(new Data("/sample/Images/definiendo/defH1.jpg", "Matriz H - Galerkin modificado y regla del producto"));
        lista.add(new Data("/sample/Images/definiendo/defH2.jpg", "Matriz H - Integrando"));
        lista.add(new Data("/sample/Images/definiendo/defH3.jpg", "Matriz H - Definiendo"));
        lista.add(new Data("/sample/Images/definiendo/defK1.jpg", "Matriz K - Galerkin modificado y regla del producto"));
        lista.add(new Data("/sample/Images/definiendo/defK2.jpg", "Matriz K - Definiendo submatrices"));
        lista.add(new Data("/sample/Images/definiendo/defK3.jpg", "Matriz K - Integrando"));
        lista.add(new Data("/sample/Images/definiendo/defK4.jpg", "Matriz K - Definiendo"));
        lista.add(new Data("/sample/Images/definiendo/defF1_1.jpg", "Matriz f1"));
        lista.add(new Data("/sample/Images/definiendo/defF1_2.jpg", "Matriz f1 - definiendo"));
        lista.add(new Data("/sample/Images/definiendo/defF2.jpg", "Matriz f2"));

        //lista.add(new Data("/sample/Images/1.gif", "Bonus track"));
        return lista;
    }
}
