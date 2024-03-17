/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shopmain;

import java.util.ArrayList;

/**
 *
 * @author babos
 */
public class InterOrder {
    
    ArrayList<Menu> itemlist  = new ArrayList<>();
    
    public void addcart(Menu item) {
        itemlist.add(item);
    }
    
    public ArrayList<Menu> getcart() {
        return this.itemlist;
    }
    public void clearcart() {
        itemlist.clear();
    }
    
    public int getLength() {
        return itemlist.size();
    }
    
}
