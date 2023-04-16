/**
 * Sample Skeleton for 'VentanaImprimir.fxml' Controller Class
 */

package com.edu.uniquindio.centroImpresion.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImprimirController {

    @FXML // fx:id="numCopias"
    private Spinner<?> numCopias; // Value injected by FXMLLoader

    @FXML // fx:id="printButton"
    private Button printButton; // Value injected by FXMLLoader

    @FXML // fx:id="printWindow"
    private AnchorPane printWindow; // Value injected by FXMLLoader

    @FXML // fx:id="printersList"
    private ChoiceBox<?> printersList; // Value injected by FXMLLoader

    @FXML // fx:id="searchDocs"
    private Button searchDocs; // Value injected by FXMLLoader

    @FXML // fx:id="text"
    private TextArea text; // Value injected by FXMLLoader

    @FXML // fx:id="tipoHoja"
    private ChoiceBox<?> tipoHoja; // Value injected by FXMLLoader

    @FXML
    void buscarDocumento(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            try {
                Scanner scanner = new Scanner(selectedFile);
                StringBuilder content = new StringBuilder();

                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append("\n");
                }
                text.setText(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
