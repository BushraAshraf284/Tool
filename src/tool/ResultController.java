/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import static tool.ComparisonMatrixController.size;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ResultController implements Initializable {

    @FXML
    private TableView<Requirements> tabledata;
    @FXML
    private TableColumn<Requirements, String> feature;
    @FXML
    private TableColumn<Requirements, Integer> priority;
    
    static int size = GetReqController.reqs.size(); 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       calculation();
       feature.setCellValueFactory(new PropertyValueFactory<>("feature"));
       priority.setCellValueFactory(new PropertyValueFactory<>("priority"));       
       tabledata.setItems(GetReqController.reqs);
       
    }  
    
    public void calculation()
    {
        double sum;
        double p;
        for(int i=0;i<size;i++)
        {
            sum=0;
            for (int j=0;j<size;j++)
            {
                sum=+ComparisonMatrixController.compMatrix[j][i]; 
                System.out.print(" SUM=" + sum);
                
            }
             
            for(int k=0;k<size;k++)
        {
            for(int j=0;j<size;j++)           
            {
               
                
                System.out.print(ComparisonMatrixController.compMatrix[k][j]+"\t");
            }
            
            System.out.println();
            
        }
            for(int j=0;j<size;j++)
            {
                System.out.println("Sum="+sum+" Col="+i);
                ComparisonMatrixController.compMatrix[j][i]=ComparisonMatrixController.compMatrix[j][i]/sum;
                System.out.println( "matrix[" +j+ "][" +i+"]="+ ComparisonMatrixController.compMatrix[j][i]);
            }
            
        }
        for(int i=0;i<size;i++)
        {
            p=0;
            for (int j=0;j<size;j++)
            {
                p=+ComparisonMatrixController.compMatrix[i][j];
                System.out.print(p+ "\t");
            }
            System.out.println("Priority for "+(i+1)+"= "+ p);
            GetReqController.reqs.get(i).setPriority(p);
        }
    }
    
}
