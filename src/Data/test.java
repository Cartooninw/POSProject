///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package Data;
//
//import java.util.ArrayList;
//
///**
// *
// * @author cart
// */
//public class test {
//    public static void main(String[] args) {
//        DataBase file = new DataBase();
//        ArrayList<String> mylist = file.readRecordData();
//        for (String user : mylist) {
//            System.out.println(user.split(";").length);
//        }
//    }
//}
//import Data.DataBase;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
       DataBase base = new DataBase();
        LocalTime curTime = LocalTime.now();
        LocalDate curdate =LocalDate.now();
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalTime.MIN);
       base.writeRevenue(String.format("%s;%s;%s;%s\n", curdate.format(formatted),OPD.getRevenueCount(),OPD.getOrderCount(),OPD.getDiscoutCount()));
        System.out.println(String.format("%s;%s;%s;%s\n", curdate.format(formatted),OPD.getRevenueCount(),OPD.getOrderCount(),OPD.getDiscoutCount()));
    }
}