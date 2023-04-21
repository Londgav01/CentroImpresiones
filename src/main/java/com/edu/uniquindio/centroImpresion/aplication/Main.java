package com.edu.uniquindio.centroImpresion.aplication;
/**
 * @author santiago londoño gaviria
 *Clase que representa la aplicacion del centro de impresion.
 */
import com.edu.uniquindio.centroImpresion.model.CentroImpresion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 Clase que representa la application principal del centro de impresion.
 */
public class Main extends Application {
    //Atributos
    private Stage primaryStage= new Stage();
    private Stage primaryStage2= new Stage();
    CentroImpresion centro= new CentroImpresion("12345");

    /**
     Metodo que se ejecuta al iniciar la aplicacion.
     @throws Exception sí ocurre algún error en la ejection.
     */
    @Override
    public void init() throws Exception {
        super.init();
    }

    /**
     Método que inicia la aplicacion.
     @param stage el stage principal.
     @throws Exception sí ocurre algún error en la ejecucion.
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Principal");
        stage.setScene(scene);
        stage.show();
        //abrirVentanaImpresora();
        //abrirVentanaImprimir();
    }

    /**
     Metodo que se ejecuta al finalizar la aplicacion.
     @throws Exception si ocurre algun error en la ejecucion.
     */
    @Override
    public void stop() throws Exception {
        super.stop();
    }

    /**
     Metodo main de la aplicacion.
     @param args argumentos para la ejecucion.
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     Metodo que abre la ventana de administration de impresoras.
     @throws Exception sí ocurre algún error en la ejecucion.
     */
    public void abrirVentanaImpresora() throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("VentanaImpresora.fxml"));
            AnchorPane rootLayout = (AnchorPane)loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setTitle("Administracion de impresoras");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     Metodo que abre la ventana de impresion.
     @throws Exception sí ocurre algún error en la ejecucion.
     */
    public void abrirVentanaImprimir() throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("VentanaImprimir.fxml"));
            AnchorPane rootLayout = (AnchorPane)loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage2.setTitle("Ventana Imprimir");
            primaryStage2.setScene(scene);
            primaryStage2.show();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
