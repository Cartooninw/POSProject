/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import java.io.File;
import java.util.Formatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Writer;
import java.io.FileWriter;
/**
 *
 * @author cart
 */
public class DataBase {
    
    protected File userfile = new File("src/Data/userdata.txt");
    protected File recordfile = new File("src/Data/recorddata.txt");

    public File getUserfile() {
        return userfile;
    }

    public File getRecordfile() {
        return recordfile;
    }
    
    
    public void addUserData(String tofile) {
        try {
        FileWriter writen = new FileWriter(this.userfile.getAbsolutePath(),true);
        writen.write(tofile);
        writen.close();
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    public ArrayList<String> readUserData() {
        ArrayList<String> toread = new ArrayList<>();
            try {
                    Scanner sc = new Scanner(this.userfile);
                    while (sc.hasNextLine()) {
                        toread.add(sc.nextLine());
                }
                    sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }   
         return toread;
        }
    
     public void addRecordData(String tofile) {
        try {
        FileWriter writen = new FileWriter(this.recordfile.getAbsolutePath(),true);
        writen.write(tofile);
        writen.close();
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    public ArrayList<String> readRecordData() {
        ArrayList<String> toread = new ArrayList<>();
            try {
                    Scanner sc = new Scanner(this.recordfile);
                    while (sc.hasNextLine()) {
                        toread.add(sc.nextLine());
                }
                    sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }   
         return toread;
        }
    
}
