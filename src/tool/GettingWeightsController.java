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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class GettingWeightsController implements Initializable {

    @FXML
    private TextField bw;
    @FXML
    private TextField pw;
    @FXML
    private TextField cw;
    @FXML
    private TextField rw;
    
    int b,p,rk,c;
    
    static ArrayList<Integer> l = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submit(ActionEvent event) throws IOException {
        
        try{           
            
        
         b=Integer.parseInt(bw.getText());
         p=Integer.parseInt(pw.getText());
         c=Integer.parseInt(cw.getText());
        rk=Integer.parseInt(rw.getText());     
        
        l.add(b);
        l.add(p);
        l.add(c);
        l.add(rk);
        
         Parent root = FXMLLoader.load(getClass().getResource("FinalResult.fxml"));
         Scene next = new Scene(root);       
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(next);
         window.show();

        
       
        }
        catch(Exception e)
        {
            System.out.println("We have a problem");
            e.printStackTrace();
        }
        
                
        
    }
    
    
    
}
