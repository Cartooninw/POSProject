/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Record;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author cart
 */
public class DateTest {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
        System.out.println(myDate);
        LocalDateTime mydatetime = LocalDateTime.now();
        System.out.println(mydatetime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        String formatted = mydatetime.format(format);
        System.out.println(formatted);
                }
}
