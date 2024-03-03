/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUser;

/**
 *
 * @author cart
 */
public class User {
    public String Username ;
    private String password ;
    private double point;
    private double money;

    public User(){};
        
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return password;
    }

    public double getPoint() {
        return point;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    
    
}
