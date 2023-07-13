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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class GettingPriorityController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label31;
    @FXML
    private TextField benefit;
    @FXML
    private TextField penalty;
    @FXML
    private TextField cost;
    @FXML
    private TextField risk;
    @FXML
    private TextField req;
    @FXML
    private Label label;
    
    static ObservableList<Features> list = FXCollections.observableArrayList();
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @FXML
    private void Add(ActionEvent event) {
        
        try{ 
                     
            
        String r = req.getText();
        int b=Integer.parseInt(benefit.getText());
        int p=Integer.parseInt(penalty.getText());
        int c=Integer.parseInt(cost.getText());
        int rk=Integer.parseInt(risk.getText());
        
        list.add(new Features(r,b,p,c,rk));
        
        System.out.println(list.get(0));
        }
        catch(Exception e)
        {
            System.out.println("We have a problem");
            e.printStackTrace();
        }
       
    }

 
    @FXML
    private void changeScene(ActionEvent event) throws IOException {
        
         Parent root = FXMLLoader.load(getClass().getResource("GettingWeights.fxml"));
         Scene next = new Scene(root);         
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(next);
         window.show();
    }
    
}
