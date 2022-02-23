//Jack Alexander
//02/12/2022
//this makes the deliverypizza class and adds a fee depending on cost of pizza to the total cost
package com.company;

import java.text.DecimalFormat;

public class DeliveryPizza extends Pizza{
    double pizzaCost;
    String s;
    public DeliveryPizza(String new_string, double new_Int) {
        super(new_string, new_Int);
        pizzaCost = new_Int;
        s=new_string;
    }
    public double deliveryCost(){
        double x = 0;
        if(pizzaCost>20){
            x=2;
        }
        else{
            x=5;
        }
        return x;
    }
    public double deliveryCostTotal() {
        if(pizzaCost>20){
            pizzaCost+=2;
        }
        else{
            pizzaCost +=5;
        }
        return pizzaCost;
    }
    @Override
    public String toString(){
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Your pizza with " + s + " costs $"+ formatter.format(pizzaCost) +" with a delivery fee of $"+ formatter.format(deliveryCost()) + " totaling to $"+formatter.format(deliveryCostTotal()));
        return null;
    }
}
