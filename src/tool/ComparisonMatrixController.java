/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ComparisonMatrixController implements Initializable {

    @FXML
    private Button next;    
    @FXML
    private Button add6;
    @FXML
    private Text info;
    @FXML
    private TextField val;
    @FXML
    private ComboBox<Integer> combo1;
    @FXML
    private ComboBox<Integer> combo2;
    @FXML
    private Text notify;
    
    ObservableList<Integer> totalreqs = FXCollections.observableArrayList();      
    
    static int size = GetReqController.reqs.size(); 
    static double compMatrix[][]= new double[size][size];
    static int comparisons;
    int check=0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setValues();
        combo1.setItems(totalreqs);
        combo2.setItems(totalreqs);
        comparisons=(size*(size-1))/2;
        System.out.println("No. of comparisons:" + comparisons);
        info.setText("Enter "+comparisons+" comparisons:");
        setMatrix();        
    }    

    @FXML
    private void changeToResult(ActionEvent event) throws IOException 
    {
       
        Parent root = FXMLLoader.load(getClass().getResource("Result.fxml"));
         Scene next = new Scene(root);        
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(next);
         window.show();
    }

    @FXML
    private void Add(ActionEvent event) 
    {
             
        if(check<comparisons)
        {          
            int a,b;
            double c;
            a=combo1.getValue()-1;
            b=combo2.getValue()-1;           

            if(a!=b)
            {
                if(isStringDouble(val.getText()))
                {
                    c=Integer.parseInt(val.getText());
                    compMatrix[a][b]=c;
                    compMatrix[b][a]=1/c;
                    System.out.println("a="+ a+ " b="+ b);                    
                    check++;
                    setMatrix(); 
                    notify.setText("Comparison value is added!");                      
                }
                else
                {
                    notify.setText("Value entered is not a numeric value!");
                }
            }
            else
            {
                notify.setText("Select different Requirements ID.");
            }
        }
        else
        {
            notify.setText("Required Comparisons are complete.");
        }
    }
    
    public void setValues()
    {
        for(int i=1;i<=GetReqController.reqs.size();i++)
        {
            totalreqs.add(i);           
        }
    }
        public boolean isStringDouble(String s)

    {
        try
        {
            Double.parseDouble(s);
            return true;
        } 
        catch (NumberFormatException ex)
        {
            return false;
        }
    }
    
    public void setMatrix()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==j)
                {
                    compMatrix[i][j]=1;
                }
                
                System.out.print(compMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
   
    
    
    
    
}
