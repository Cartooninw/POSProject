/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shopmain;

/**
 *
 * @author babos
 */
public class FriedFood extends Menu{

    public  FriedFood(
    String name , double price 
    ) {
        this.name = name;
        this.price = price;
    }

    
    @Override
    public String gettoppingcode() {
        return "12";
    }
    
    @Override
    public double discout(double totalprice ,boolean paywith , double point ) {
       return 12.2; //need formular
    }
    
}
