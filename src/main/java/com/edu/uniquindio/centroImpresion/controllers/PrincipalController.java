/**
 * Sample Skeleton for 'VentanaPrincipal.fxml' Controller Class
 */

package com.edu.uniquindio.centroImpresion.controllers;

import com.edu.uniquindio.centroImpresion.aplication.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class PrincipalController implements Initializable {
    Main main = new Main();
    Stage primaryStage= new Stage();

    @FXML // fx:id="botonAdmin"
    private Button botonAdmin; // Value injected by FXMLLoader

    @FXML // fx:id="botonImpresiones"
    private Button botonImpresiones; // Value injected by FXMLLoader

    @FXML
    private ImageView imagen= new ImageView();


    @FXML
    void abrirAdmin(ActionEvent event) throws Exception {

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
        };

        //System.out.println("edref");
    }

    @FXML
    void abrirImpresiones(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("VentanaImprimir.fxml"));
            AnchorPane rootLayout = (AnchorPane)loader.load();
            Scene scene = new Scene(rootLayout);

            primaryStage.setTitle("Administracion de impresoras");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen.setImage(new Image("C:\\Users\\londg\\OneDrive\\Escritorio\\santiago\\Programacion2\\CentroImpresion\\src\\main\\resources\\com\\edu\\uniquindio\\centroImpresion\\aplication\\ImpresionesUQ.png"));
    }
}
