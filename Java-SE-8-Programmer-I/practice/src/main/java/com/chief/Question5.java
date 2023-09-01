package com.chief;

class CustomerAccount{
ElectricAccount acct = new ElectricAccount();

public void useElectricity(double kwh){
    acct.addkwh();
}
}

class ElectricAccount{

    private double kwh;
    private double rate;
    private double bill;
    
    public void addkwh() {
    }


}
public class Question5 {
    public static void main(String[] args) {
        
    }
}
