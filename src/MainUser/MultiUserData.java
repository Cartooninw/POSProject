/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainUser;
import java.util.ArrayList;
import Data.DataBase;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author cart
 */
public class MultiUserData {
    protected ArrayList<User> UserData = new ArrayList<>();
    protected int numline;
    protected boolean numlineremove;
    public void updatedata() {
        try {
            DataBase file = new DataBase();
            BufferedReader reader = new BufferedReader(new FileReader(file.getUserfile()));      
            StringBuilder sb = new StringBuilder();
            ArrayList<String> insertset = new ArrayList<>();
            User targetuser = UserData.get(this.numline);
            insertset.add(targetuser.getUsername());
            insertset.add(targetuser.getPassword());
            insertset.add(targetuser.getPoint()+"");
            insertset.add(targetuser.getMoney()+"");
            insertset.add(targetuser.getPermission());
            String line;
            while ((line = reader.readLine()) != null) {
                String[] linesplit = line.split(";");
                
                if (linesplit[0].equals(insertset.get(0)) ) {
                    System.out.println(insertset.get(0));
                    System.out.println("in");
                    if (!this.numlineremove) {
                        sb.append(String.format("%s;%s;%s;%s;%s", insertset.get(0), insertset.get(1), insertset.get(2), insertset.get(3), insertset.get(4))).append(System.lineSeparator());
                    } else {
                        this.UserData.remove(this.UserData.indexOf(getSelectuser(insertset.get(0))));
                        this.numlineremove = false;
                        continue;
                    }
                } else {
                    sb.append(line).append(System.lineSeparator());
                }
            }
            
            reader.close();
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getUserfile()));
            writer.write(sb.toString());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }
    
    public void readdata() {
        DataBase file = new DataBase();
        String[] todata ;

        try {
            this.UserData.clear();
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
//                for (User data: this.UserData) {
//                     System.out.println(data.getUsername());
//                 }
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
    public void insertUser(String user) {
//        String[] usersplit = user.split(";");
        User target = getSelectuser(user);
//        for (User select : this.UserData) {
//            if (select == target) {
//                User forinsert = new User();
//                forinsert.setUsername(usersplit[0]);
//                forinsert.setPassword(usersplit[1]);
//                forinsert.setPoint(Double.parseDouble(usersplit[2]));
//                forinsert.setMoney(Double.parseDouble(usersplit[3]));
//                forinsert.setPermission(usersplit[4]);
                this.numline = this.UserData.indexOf(target);
                System.out.println(this.numline);
//                this.UserData.add(this.UserData.indexOf(select),forinsert);
//                this.UserData.remove(select);
//            }
//        }
    }
    
//    public void createadmin() {
//        User admin = new User();
//        admin.setUsername("admin");
//        admin.setPassword("admin");
//        admin.setPoint(9999);
//        admin.setMoney(9999);
//        admin.setPermission("admin");
//        this.UserData.add(admin);
//    }
    public User getSelectuser(String name) {
        for (User A : this.UserData) {
            if (A.getUsername().equals(name)) {
                return A;
                }
            }
        return null;
    }
    public void setPointBySelected(String name) {
        User Selected = getSelectuser(name);
        this.numline = UserData.indexOf(Selected);
    }
//    public double getPointBySelected(String name) {
//        User target = getSelectuser(name);
////        System.out.println(target.getPoint());
//        return target.getPoint();
//    }
    
    public void RemoveSelectuser(String name){
        this.numlineremove = true;
        this.numline = this.UserData.indexOf(getSelectuser(name));
//        this.UserData.remove(this.UserData.indexOf(getSelectuser(name)));
    }
    
}