/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author cart
 */
//order per day.
public class OPD {
        protected static int OrderCount;
        protected static double RevenueCount;
        protected static int DiscoutCount;

    public static void addOrderCount() {
         OPD.OrderCount += 1;
    }
   public static int getOrderCount() {
       return OrderCount;
   }
    public static void resetTheDay() {
        OrderCount = 0;
        RevenueCount = 0;
        DiscoutCount = 0;
    }
//    public static void setOrderCount(int OrderCount) {
//        OPD.OrderCount = OrderCount;
//    }

    public static double getRevenueCount() {
        return RevenueCount;
    }

    public static void addRevenueCount(double RevenueCount) {
        OPD.RevenueCount += RevenueCount;
    }

    public static int getDiscoutCount() {
        return DiscoutCount;
    }

    public static void addDiscoutCount( ) {
        OPD.DiscoutCount += 1;
    }
}
