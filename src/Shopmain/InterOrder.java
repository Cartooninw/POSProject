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
public interface InterOrder {
    
    public Itemlist<String> selectedItems = new Itemlist<>();
    public class Itemlist<T> {

       public Itemlist() {
       }
    }    
    
}
