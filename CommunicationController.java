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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class CommunicationController implements Initializable {

    @FXML
    private TextArea MassageTextArea;
    @FXML
    private TextField EmailTextFied;
    @FXML
    private TextField NameTextField;
    @FXML
    private Button LogOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackClickedOnButton(ActionEvent event) {
    }

    @FXML
    private void SentClickedOnButton(ActionEvent event) {
    }
    
}
