/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainUser;
import java.util.ArrayList;
import Data.DataBase;
import java.util.Scanner;

/**
 *
 * @author cart
 */
public class MultiUserData {
    protected ArrayList<User> UserData = new ArrayList<>();
    
    public void readdata() {
        DataBase file = new DataBase();
        String[] todata ;

        try {
            UserData.clear();
             Scanner sc = new Scanner(file.getUserfile());
             while (sc.hasNextLine()) {
                 String line = sc.nextLine();
                 if (line != null && !line.equals("")) {
                    User newuser = new User();
                     todata = line.split(";");
//                     for (String user: todata ) {
//                         System.out.println(user);
                        newuser.setUsername(todata[0]);
//                        System.out.println(todata[0]);
                        newuser.setPassword(todata[1]);
//                        System.out.println(todata[1]);
                        newuser.setPoint(Double.parseDouble(todata[2]));
//                        System.out.println(todata[2]);
                        newuser.setMoney(Double.parseDouble(todata[3]));
//                        System.out.println(todata[3]);
                        newuser.setPermission(todata[4]);
//                        System.out.println(todata[4]);
//                     }
                    this.UserData.add(newuser);

                 }
             }
                for (User data: UserData) {
                     System.out.println(data.getUsername());
                 }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    public void addUser(String name,String Password) {
        DataBase file = new DataBase();
//        User newuser = new User();
        file.addUserData(String.format("%s;%s;0;0;Customer\n", name,Password));
//        newuser.setUsername(name);
//        newuser.setPassword(Password);
//        newuser.setPoint(0);
//        newuser.setMoney(0);
//        newuser.setPermission("Customer");
//        this.UserData.add(newuser);
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
    
    public void RemoveSelectuser(String name){
        UserData.remove(UserData.indexOf(getSelectuser(name)));
    }
    
}