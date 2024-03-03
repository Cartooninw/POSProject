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
    private String Permission;

    public User(){};

    public String getPermission() {
        return Permission;
    }

    protected void setPermission(String Permission) {
        this.Permission = Permission;
    }
        
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

    protected void setPassword(String password) {
        this.password = password;
    }

    protected void setPoint(double point) {
        this.point = point;
    }

    public double getMoney() {
        return money;
    }

    protected void setMoney(double money) {
        this.money = money;
    }
    
    
    
}
