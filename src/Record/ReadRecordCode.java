/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Record;
import Data.DataBase;
import java.util.ArrayList;
/**
 *
 * @author cart
 */
public class ReadRecordCode {
    DataBase basedata = new DataBase();
    ArrayList<String> data;

    public ArrayList<String> getData() {
        return data;
    }
    
    public String GetSelectCode(String code) {
        for (String record : data) {
            if (record.split(";")[4].equals(code)) {
                return record;
            } 
        }
        return null;
    }
    
    
    public void setData(ArrayList<String> data) {
        this.data = data;
    }
    
    public void readdata() {
        this.data = basedata.readRecordData();
    }
}   
