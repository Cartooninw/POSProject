/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainUser;

/**
 *
 * @author cart
 */
public class UserManager implements Userdata{
    public String Username;
    User Userdata = Data.getSelectuser(this.Username);
    private double Usermoney = Userdata.getMoney();
    private double Userpoint = Userdata.getPoint();
    public UserManager(String Username) {
        this.Username = Username;
    }

    public String getUsername() {
        return Username;
    }


    public User getUserdata() {
        return Userdata;
    }


    public double getUsermoney() {
        return Usermoney;
    }


    public double getUserpoint() {
        return Userpoint;
    }


    public void setUserpoint(double Point){
        Userdata.setPoint(Point);
    }
    
    private void setUsermoney(double money){
        Userdata.setPoint(money);
    }
    
    public void authernticatiorsetmoney(String Password,double money) {
        if(Userdata.getPassword().equals(Password)) {
            this.setUsermoney(money);
        }
    }
}
