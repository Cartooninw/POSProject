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
public interface InterOrder {
    
    ArrayList<AllFood> selectedItems = new ArrayList<>();

    public void addSelectedItem(AllFood selectedItem);
}
