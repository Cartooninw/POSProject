/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainUser;
import java.util.ArrayList;

/**
 *
 * @author cart
 */
public class MultiUserData {
    ArrayList<User> UserData = new ArrayList<>();
    public void addUser(String name,String Password) {
        User newuser = new User();
        newuser.setUsername(name);
        newuser.setPassword(Password);
        newuser.setPoint(0);
        newuser.setMoney(0);
        newuser.setPermission("Customer");
        this.UserData.add(newuser);
    }
    
    public void createadmin() {
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setPoint(9999);
        admin.setMoney(9999);
        admin.setPermission("admin");
        this.UserData.add(admin);
    }
    public User getSelectuser(String name) {
        for (User A : UserData) {
            if (A.getUsername().equals(name)) {
                return A;
                }
            
            }
        return null;
    }
}