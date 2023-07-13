/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

/**
 *
 * @author DELL
 */
public class Requirements 
{
  static int i=1;
  String feature;
  double priority;
  int id;

    public Requirements(String feature) {
        this.feature = feature;        
        id=i;
        i++;
       
    }

    public Requirements() {
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Requirements{" + "feature=" + feature + ", priority=" + priority + ", id=" + id + '}';
    }
    
    
    
  
  
}
