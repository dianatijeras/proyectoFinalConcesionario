package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.controller.BuscarOEliminarVehiculoController;
import co.edu.uniquindio.poo.proyectofinal.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;


public class BuscarOEliminarVehiculoViewController {

    private BuscarOEliminarVehiculoController buscarOEliminarVehiculoController = new BuscarOEliminarVehiculoController();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_BuscarVehiculo;

    @FXML
    private Button btn_EliminarVehiculo;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_PlacaVehiculo;

    @FXML
    private Label lbl_Vehiculo2;

    @FXML
    private Pane pn_MenuVehiculo2;

    @FXML
    private Separator sp_Titulo;

    @FXML
    private TextField txf_PlacaVehiculo;

    @FXML
    void onClick_BuscarVehiculo(ActionEvent event) {
        String placaVehiculo = txf_PlacaVehiculo.getText();
        Vehiculo vehiculo = buscarOEliminarVehiculoController.buscarVehiculo(placaVehiculo);
        JOptionPane.showMessageDialog(null, "Vehiculo: " + vehiculo);
    }

    @FXML
    void onClick_EliminarVehiculo(ActionEvent event) {
        String placa = txf_PlacaVehiculo.getText();
        buscarOEliminarVehiculoController.eliminarVehiculo(placa);
    }

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAVentanaAnterior();
    }

    public void volverAVentanaAnterior() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuVehiculo.fxml"));
            Parent root = loader.load();


            Stage currentStage = (Stage) (btn_Volver).getScene().getWindow();


            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }



    @FXML
    void initialize() {
        assert btn_BuscarVehiculo != null : "fx:id=\"btn_BuscarVehiculo\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";
        assert btn_EliminarVehiculo != null : "fx:id=\"btn_EliminarVehiculo\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";
        assert lbl_PlacaVehiculo != null : "fx:id=\"lbl_PlacaVehiculo\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";
        assert lbl_Vehiculo2 != null : "fx:id=\"lbl_Vehiculo2\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";
        assert pn_MenuVehiculo2 != null : "fx:id=\"pn_MenuVehiculo2\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";
        assert sp_Titulo != null : "fx:id=\"sp_Titulo\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";
        assert txf_PlacaVehiculo != null : "fx:id=\"txf_PlacaVehiculo\" was not injected: check your FXML file 'MenuBuscarOEliminarVehiculo.fxml'.";

    }

}
