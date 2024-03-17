/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shopmain;
import javax.swing.JCheckBox;
import javax.swing.RowFilter;
/**
 *
 * @author cart
 */
public class OrderListFilter extends RowFilter{
   JCheckBox FriedFoodCheck1;
   JCheckBox SeaFoodCheck1;
   String name;
    public OrderListFilter (String name , JCheckBox FriedFoodCheck , JCheckBox SeaFoodCheck ) {
        this.name = name;
        this.FriedFoodCheck1 = FriedFoodCheck;
        this.SeaFoodCheck1 = SeaFoodCheck;
    }
    
    
    @Override
    public boolean include(Entry entry) {
        String name = entry.getValue(0).toString();
        String type = entry.getValue(2).toString();
        boolean FriedFoodCheck;
        boolean SeaFoodCheck;
        if (this.FriedFoodCheck1.isSelected()) {
                 FriedFoodCheck =   type.contains("FriedFood");
        } else {
                 FriedFoodCheck =   true;
        }
        
             if (this.SeaFoodCheck1.isSelected()) {
                 SeaFoodCheck =   type.contains("SeaFood");
        } else {
                 SeaFoodCheck =   true;
        }
        
        boolean Search = this.name.isEmpty() || name.contains(this.name);

        
        return FriedFoodCheck && SeaFoodCheck && Search;
    }
}
