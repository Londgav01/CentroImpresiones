module com.edu.uniquindio.centroimpresion {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.edu.uniquindio.centroImpresion.controllers;
    opens com.edu.uniquindio.centroImpresion.controllers to javafx.fxml;
    exports com.edu.uniquindio.centroImpresion.aplication to javafx.graphics;

}