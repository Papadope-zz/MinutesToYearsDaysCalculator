/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutestoyearsanddayscalculator;

/**
 *
 * @author User
 */
public class MinutesToYearsAndDaysCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long year = minutes / 525600;
            long remainingDay = minutes % 525600;
            long day = remainingDay / 1440;

            System.out.println(minutes + " min " + "= " + year + " y" + " and " + day + " d");
        }
    }

}
