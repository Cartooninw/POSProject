/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author cart
 */
public class test {
    public static void main(String[] args) {
        DataBase file = new DataBase();
        ArrayList<String> mylist = file.readRecordData();
        for (String user : mylist) {
            System.out.println(user.split(";").length);
        }
    }
}
