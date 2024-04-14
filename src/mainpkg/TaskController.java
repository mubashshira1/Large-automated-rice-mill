/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TaskController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void BackButtonOnClick(ActionEvent event)throws IOException {
    
     FXMLLoader loader = new FXMLLoader(getClass().getResource("MachineMaintenanceEngineer.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene MachineMaintenanceEngineer = new Scene(parent);

        currentStage.setScene(MachineMaintenanceEngineer);
        currentStage.show();    
    }

    @FXML
    private void ViewTaskButtonOnClick(ActionEvent event) {
    sceneSwitch("/com/MachineMaintenanceEngineer/views/Task/ViewTaskButtonOnClick.fxml");
    }

    @FXML
    private void EditMaintenanceTaskButtonOnClick(ActionEvent event) {
    sceneSwitch("/com/MachineMaintenanceEngineer/views/Task/EditMaintenanceTaskButtonOnClick.fxml");   
    }

    @FXML
    private void EditShipmentTaskStatusButtonOnClick(ActionEvent event) {
    sceneSwitch("/com/MachineMaintenanceEngineer/views/Task/EditShipmentTaskStatusButtonOnClick.fxml"); 
    }

    @FXML
    private void ViewMaintenanceTaskTaskButtonOnClick(ActionEvent event) {
    sceneSwitch("/com/MachineMaintenanceEngineer/views/Task/ViewMaintenanceTaskTaskButtonOnClick.fxml");    
    }

    @FXML
    private void ViewShipmentTaskButtonOnClick(ActionEvent event) {
    sceneSwitch("/com/MachineMaintenanceEngineer/views/Task/ViewShipmentTaskButtonOnClick.fxml");   
    }
    
}
