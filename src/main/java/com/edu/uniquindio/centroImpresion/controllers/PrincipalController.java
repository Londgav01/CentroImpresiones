/**
 * Sample Skeleton for 'VentanaPrincipal.fxml' Controller Class
 */

package com.edu.uniquindio.centroImpresion.controllers;

import com.edu.uniquindio.centroImpresion.aplication.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class PrincipalController {
    Main main = new Main();

    @FXML // fx:id="botonAdmin"
    private Button botonAdmin; // Value injected by FXMLLoader

    @FXML // fx:id="botonImpresiones"
    private Button botonImpresiones; // Value injected by FXMLLoader

    @FXML
    void abrirAdmin(ActionEvent event) throws Exception {}

    @FXML
    void abrirImpresiones(ActionEvent event) {}

}
