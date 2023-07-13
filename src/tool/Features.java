/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author DELL
 */
public class Features {
    public String Req;
   public int  No,benefit,penalty,totalValue,cost,risk;
   public  double  costp,valp,riskp,priority;

    public Features() {
    }

    public Features(String Req, int benefit, int penalty, int cost, int risk) {
        this.Req = Req;
        this.benefit =benefit;
        this.penalty =penalty;
        this.cost = cost;
        this.risk =risk;
    }

    @Override
    public String toString() {
        return "Features{" + "Req=" + Req + ", No=" + No + ", benefit=" + benefit + ", penalty=" + penalty + ", totalValue=" + totalValue + ", valp=" + valp + ", cost=" + cost + ", costp=" + costp + ", risk=" + risk + ", riskp=" + riskp + ", priority=" + priority + '}';
    }

    public String getReq() {
        return Req;
    }

    public void setReq(String Req) {
        this.Req = Req;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public double getValp() {
        return valp;
    }

    public void setValp(double valp) {
        this.valp = valp;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getCostp() {
        return costp;
    }

    public void setCostp(double costp) {
        this.costp = costp;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public double getRiskp() {
        return riskp;
    }

    public void setRiskp(double riskp) {
        this.riskp = riskp;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }
    

    

    

    
    
    
}
