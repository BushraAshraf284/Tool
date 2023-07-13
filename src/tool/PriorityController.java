/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class PriorityController implements Initializable {
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changetoPriority(ActionEvent event) throws IOException 
    {
         Parent root = FXMLLoader.load(getClass().getResource("GettingPriority.fxml"));
         Scene next = new Scene(root);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(next);
         window.show();
    }

    @FXML
    private void changeToAHP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GetReq.fxml"));
         Scene next = new Scene(root);        
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(next);
         window.show();
    }


    
}
