/**
 * Class: Chocolate
 * Author: William chokbengboune
 * Written: January 26th, 2023
 * Course: January 26th, 2023
 * Version: 1.0
 * Description: Calculates the number of bags needed for appropriate amount  of chocolate.
 */

public class Chocolate {
    public static void main(String[] args){
        int bag = 9;
        int chocolatePerBag = 2;
        int maxCapacity = 3;
        int bagsNeeded = bag * chocolatePerBag / maxCapacity;
        System.out.println("The chocolates need " + bagsNeeded + " bags.");

    }
}
