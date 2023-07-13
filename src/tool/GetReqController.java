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
import javafx.collections.FXCollections;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class GetReqController implements Initializable {

    @FXML
    private Button next;    

    static ObservableList<Requirements> reqs = FXCollections.observableArrayList();
    @FXML
    private TextField rq1;
    @FXML
    private Button add;
    @FXML
    private Text notify;
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Add(ActionEvent event) 
    {
         
        if(reqs.size()!=15)
        {   
            String r1 = rq1.getText();   
            reqs.add(new Requirements(r1));  
            notify.setText( reqs.size()+" requirement is added");
            System.out.println(reqs.get(0));
        }
        else
        {
           notify.setText("15 Requirements are added!");
        }
        
    }

    @FXML
    private void changeToComparison(ActionEvent event) throws IOException {
        
         Parent root = FXMLLoader.load(getClass().getResource("ComparisonMatrix.fxml"));
         Scene next = new Scene(root);        
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(next);
         window.show();
    }


    
}
