//Jack Alexander
//02/12/2022
//this makes the pizza class and determines cost of pizza
package com.company;

import java.text.DecimalFormat;

public class Pizza {
    String string;
    double Int;
    public Pizza(String new_string, double new_Int){
        this.string = new_string;
        this.Int = new_Int;
    }
    public String toString(){
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Your pizza has "+string +" on it and the price for it is: $"+ formatter.format(Int) +" dollars");
        return null;
    }
}
