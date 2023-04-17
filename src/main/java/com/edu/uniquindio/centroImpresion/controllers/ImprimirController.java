/**
 * Sample Skeleton for 'VentanaImprimir.fxml' Controller Class
 */

package com.edu.uniquindio.centroImpresion.controllers;

import com.edu.uniquindio.centroImpresion.model.CentroImpresion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.Timer;
import java.util.TimerTask;

/**
 * controlador de la ventana imprimir
 */
public class ImprimirController implements Initializable {

    //Atributtes
    CentroImpresion centro= new CentroImpresion("1234");
    @FXML // fx:id="printButton"
    private Button printButton; // Value injected by FXMLLoader

    @FXML // fx:id="printWindow"
    private AnchorPane printWindow; // Value injected by FXMLLoader

    @FXML // fx:id="printersList"
    private ChoiceBox<String> printersList; // Value injected by FXMLLoader

    @FXML // fx:id="prioridad"
    private ChoiceBox<String> prioridad; // Value injected by FXMLLoader

    @FXML // fx:id="searchDocs"
    private Button searchDocs; // Value injected by FXMLLoader

    @FXML // fx:id="text"
    private TextArea text; // Value injected by FXMLLoader

    @FXML // fx:id="tipoHoja"
    private ChoiceBox<String> tipoHoja; // Value injected by FXMLLoader

    private String[] prioridades= {"ALTA","MEDIA","BAJA"};
    private String[] hojas= {"Carta","Oficio","Default"};

    /**
     * metodo que sirve para buscar documento en los archivos del pc
     * @param event
     */
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

    /**
     * metodo del boton que imprime el documento que esta en el textArea, se demorara depende de su prioridad
     * @param event
     */
    @FXML
    void imprimirDoc(ActionEvent event) {
        String priority= prioridad.getValue();
        String texto= text.getText();
        Timer timer = new Timer();
        if(priority.equals("ALTA")){
            JOptionPane.showMessageDialog(null,texto);
        } else if (priority.equals("MEDIA")) {
            JOptionPane.showMessageDialog(null,"su impression se demora un poco");
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    JOptionPane.showMessageDialog(null,texto);
                }
            }, 15000); // tiempo en milisegundos (10 segundos)
        }else{
            JOptionPane.showMessageDialog(null,"su impression se demorara un poco harto");
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    JOptionPane.showMessageDialog(null,texto);
                }
            }, 30000); // tiempo en milisegundos (30 segundos)
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        prioridad.getItems().addAll(prioridades);
        tipoHoja.getItems().addAll(hojas);
        printersList.getItems().addAll(centro.obtenerNombresImpresoras());
    }
}

