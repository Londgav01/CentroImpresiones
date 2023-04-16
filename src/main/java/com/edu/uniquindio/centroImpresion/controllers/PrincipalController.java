/**
 * Sample Skeleton for 'VentanaPrincipal.fxml' Controller Class
 */

package com.edu.uniquindio.centroImpresion.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalController {

    @FXML // fx:id="botonAdmin"
    private Button botonAdmin; // Value injected by FXMLLoader

    @FXML // fx:id="botonImpresiones"
    private Button botonImpresiones; // Value injected by FXMLLoader

    @FXML
    void abrirAdmin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("com/edu/uniquindio/centroImpresion/aplication/VentanaImpresora.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void abrirImpresiones(ActionEvent event) {

    }

}
