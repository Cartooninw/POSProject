///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Data;
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
import java.io.*;

public class test {
    public static void main(String[] args) {
        String filePath = "src/Data/userdata.txt"; // path to your file
        int lineNumber = 5; // line number you want to edit
        String replacementText = "This is the replacement text for line 3."; // new text to replace the line

        // Read the content of the file and modify the specific line
        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            int currentLine = 1;
            while ((line = reader.readLine()) != null) {
                if (currentLine == lineNumber) {
                    sb.append(replacementText).append(System.lineSeparator());
                } else {
                    sb.append(line).append(System.lineSeparator());
                }
                currentLine++;
            }
            reader.close();

            // Write the modified content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(sb.toString());
            writer.close();

            System.out.println("Text has been edited on line " + lineNumber + " in the file.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}