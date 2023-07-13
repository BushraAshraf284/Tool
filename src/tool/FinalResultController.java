/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.net.URL;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class FinalResultController implements Initializable {

    @FXML
    private TableColumn<Features, String> feature;
   // for()
    @FXML
    private TableView<Features> tabledata;
    @FXML
    private TableColumn<Features, String> priority;
   
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       totalvalue();
       sorting ();
       feature.setCellValueFactory(new PropertyValueFactory<>("Req"));
       priority.setCellValueFactory(new PropertyValueFactory<>("priority"));
       tabledata.setItems(GettingPriorityController.list);
      
    
      System.out.println(GettingPriorityController.list.get(0));
      
    } 
    public void totalvalue()
    {
        int value;
        double  Totalvaluep=0,TotalRelativecost=0,Totalrisk=0,totalpre=0,totalprerisk=0;
        
        
        for(int i=0;i<GettingPriorityController.list.size();i++)
        {
           GettingPriorityController.list.get(i).setTotalValue(GettingPriorityController.list.get(i).getBenefit()*GettingWeightsController.l.get(0) + GettingPriorityController.list.get(i).getPenalty()*GettingWeightsController.l.get(1));
        Totalvaluep += GettingPriorityController.list.get(i).getTotalValue();
        TotalRelativecost += GettingPriorityController.list.get(i).getCost();
        Totalrisk += GettingPriorityController.list.get(i).getRisk();    
        }
          System.out.println(GettingWeightsController.l.get(2));
            System.out.println(GettingWeightsController.l.get(3));
        for(int j=0;j<GettingPriorityController.list.size();j++)
        {
            GettingPriorityController.list.get(j).setValp((GettingPriorityController.list.get(j).getTotalValue()/Totalvaluep)*100);
            GettingPriorityController.list.get(j).setCostp((GettingPriorityController.list.get(j).getCost()/TotalRelativecost)*100);
            GettingPriorityController.list.get(j).setRiskp((GettingPriorityController.list.get(j).getRisk()/Totalrisk)*100);
                totalpre=GettingPriorityController.list.get(j).getCostp()*GettingWeightsController.l.get(2);
                totalprerisk=GettingPriorityController.list.get(j).getRiskp()*GettingWeightsController.l.get(3);
             GettingPriorityController.list.get(j).setPriority(GettingPriorityController.list.get(j).getValp()/(totalpre  +totalprerisk));
        }    
        
        
    }
    public void sorting ()
    {
        Features temp=new Features();
        int n = GettingPriorityController.list.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (GettingPriorityController.list.get(j).getPriority() < GettingPriorityController.list.get(j+1).getPriority()) 
                { 
                    // swap arr[j+1] and arr[i] 
                    temp = GettingPriorityController.list.get(j); 
                    GettingPriorityController.list.set(j, GettingPriorityController.list.get(j+1));
                    GettingPriorityController.list.set(j+1, temp);
                } 
    }
    
}
