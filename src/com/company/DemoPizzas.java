//Jack Alexander
//02/12/2022
//this executes the previous classes
package com.company;

public class DemoPizzas {
    public static void main(String args[]){
        Pizza p = new Pizza("cheese and macaroni",12.99);
        p.toString();
        DeliveryPizza p1 = new DeliveryPizza("onion and sausage",14.99);
        p1.toString();
        DeliveryPizza p2 = new DeliveryPizza("fresh tomato and guacamole", 25.99);
        p2.toString();
    }
}
