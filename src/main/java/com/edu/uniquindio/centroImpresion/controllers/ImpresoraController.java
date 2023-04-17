/**
 * Sample Skeleton for 'VentanaImpresora.fxml' Controller Class
 */

package com.edu.uniquindio.centroImpresion.controllers;

import com.edu.uniquindio.centroImpresion.exceptions.ImpresoraException;
import com.edu.uniquindio.centroImpresion.model.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ImpresoraController implements Initializable {

    //Atributos
    CentroImpresion centro= new CentroImpresion("12345");

    @FXML // fx:id="addButton"
    private Button addButton; // Value injected by FXMLLoader

    @FXML // fx:id="adminWindow"
    private AnchorPane adminWindow; // Value injected by FXMLLoader

    @FXML // fx:id="backButton"
    private Button backButton; // Value injected by FXMLLoader

    @FXML // fx:id="delateButton"
    private Button delateButton; // Value injected by FXMLLoader

    @FXML // fx:id="delatePrinters"
    private ChoiceBox<String> delatePrinters; // Value injected by FXMLLoader

    @FXML // fx:id="listNewStatus"
    private ChoiceBox<String> listNewStatus; // Value injected by FXMLLoader

    @FXML // fx:id="listNewType"
    private ChoiceBox<String> listNewType; // Value injected by FXMLLoader

    @FXML // fx:id="newBrand"
    private TextField newBrand; // Value injected by FXMLLoader

    @FXML // fx:id="newName"
    private TextField newName; // Value injected by FXMLLoader

    @FXML // fx:id="updateButton"
    private Button updateButton; // Value injected by FXMLLoader

    @FXML // fx:id="updatedBrand"
    private TextField updatedBrand; // Value injected by FXMLLoader

    @FXML // fx:id="updatedName"
    private TextField updatedName; // Value injected by FXMLLoader

    @FXML
    private ChoiceBox<String> updatedPrinters;

    @FXML // fx:id="updatedStatus"
    private ChoiceBox<String> updatedStatus; // Value injected by FXMLLoader

    private String[] impresoras= {"Cartucho","Laser", "Impresora"};
    private String[] estados= {"ACTIVA","INACTIVA", "MANTENIMIENTO"};

    /**
     * Método que me sirve oara agregar una nueva impresora con ciertos parametros que el usuario da
     * @param event
     * @throws ImpresoraException
     */
    @FXML
    void agregarNuevaImpresora(ActionEvent event) throws ImpresoraException {
        String tipo= listNewType.getValue();
        String nombre= newName.getText();
        String marca= newBrand.getText();
        EstadoImpresora estado= EstadoImpresora.MANTENIMIENTO;
        if(listNewStatus.getValue().equalsIgnoreCase("ACTIVA")){
            estado= EstadoImpresora.ACTIVA;
        } else if (listNewStatus.getValue().equalsIgnoreCase("INACTIVA")) {
            estado= EstadoImpresora.INACTIVA;
        }
        Impresora impresora= new Impresora(nombre,marca,estado);
        if(tipo.equalsIgnoreCase("Cartucho")){
            impresora= new ImpresoraCartucho(nombre,marca,estado);
        } else if (tipo.equalsIgnoreCase("laser")) {
            impresora= new ImpresoraLaser(nombre,marca,estado);
        }
        centro.verificarImpresora(impresora);
        JOptionPane.showMessageDialog(null, "impresora agregada");
        listNewStatus.setValue("");
        newName.setText("");
        newBrand.setText("");
        listNewType.setValue("");
        updatedPrinters.getItems().add(impresora.getName());
        delatePrinters.getItems().add(impresora.getName());
    }

    /**
     * Métodos que elimina la impresora que el usuario quiere
     * @param event
     */
    @FXML
    void eliminarImpresora(ActionEvent event) {
        String nombre= delatePrinters.getValue();
        eliminarImpreso(nombre);
        actualizarChoiseBoxCuandoSeElimina(nombre);
        delatePrinters.setValue("");
    }

    public void eliminarImpreso(String nombreImpresora) {
        Impresora impresoraAEliminar = null;
        for (Impresora impresora : centro.getListaImpresoras()) {
            if (impresora.getName().equals(nombreImpresora)) {
                impresoraAEliminar = impresora;
                break;
            }
        }
        if (impresoraAEliminar != null) {
            centro.eliminarImpresora(impresoraAEliminar);
            JOptionPane.showMessageDialog(null, "Impresora eliminada: " + impresoraAEliminar.getName());
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró la impresora a eliminar.");
        }
    }

    /**
     * Métodos que me actualiza los datos de una impresora teniendo en cuenta lo que el usuario mete
     * @param event
     * @throws ImpresoraException
     */
    @FXML
    void actualizarImpresora(ActionEvent event) throws ImpresoraException {
        String nombre= updatedName.getText();
        String marca= updatedBrand.getText();
        String estado= updatedStatus.getValue();
        String impresora= updatedPrinters.getValue();
        actualizarImpresor(impresora,nombre,marca,estado);
    }

    public void actualizarImpresor(String nombreImpresora, String nuevoNombre, String nuevaMarca, String nuevoEstado) throws ImpresoraException {
        boolean encontrada = false;
        for (Impresora impresora : centro.getListaImpresoras()) {
            if (impresora.getName().equals(nombreImpresora)) {
                encontrada = true;
                if (nuevoNombre != null) {
                    impresora.setName(nuevoNombre);
                }
                if (nuevaMarca != null) {
                    impresora.setMarca(nuevaMarca);
                }
                if (nuevoEstado != null) {
                    impresora.setEstado(impresora.getEstado().convertirStringAEstado(nuevoEstado));
                }
                break;
            }
        }
        if (!encontrada) {
            throw new ImpresoraException("La impresora no existe");
        }
    }

    /**
     * Método que me actualiza los choiseBox luego de que es eliminada una impresora
     * @param nombre
     */
    public void actualizarChoiseBoxCuandoSeElimina(String nombre){
        // Obtener la lista actual de nombres de personas
        ObservableList<String> nombresImpre = delatePrinters.getItems();
        ObservableList<String> nombresImpres = updatedPrinters.getItems();

        // Eliminar el nombre de la persona "Juan"
                nombresImpre.remove(nombre);
                nombresImpres.remove(nombre);

        // Establecer la nueva lista de nombres de personas en el ChoiceBox
                delatePrinters.setItems(nombresImpre);
                updatedPrinters.setItems(nombresImpres);
    }

    /**
     * Método donde se inicializan todos los nodos que hay en el stage
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listNewType.getItems().addAll(impresoras);
        listNewStatus.getItems().addAll(estados);
        updatedStatus.getItems().addAll(estados);
        updatedPrinters.getItems().addAll(centro.obtenerNombresImpresoras());
        delatePrinters.getItems().addAll(centro.obtenerNombresImpresoras());
    }
}
