/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class RemoveEmployeeController implements Initializable {

    @FXML
    private TextField NameTextField;
    @FXML
    private TextField IdTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField GenderTextField;
    @FXML
    private TextField PhoneNumberTextField;
    @FXML
    private Button BackButton;
    @FXML
    private AnchorPane DepartmentTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClicked(ActionEvent event) {
    }
    
}
