/**
 * Class: Cycle
 * Author: William Chokbengboune
 * Written: January 27. 2023
 * Course: ITEC 2140 section 4
 * Version: 1.0
 * This program calculates the number of tricycles are in the shop
 */

public class Cycle {
    public static void main(String[] args){
        int bicycle = 10;
        int bicycleTire = bicycle * 2;
        int totalWheel = 47;
        int tricycleTire = totalWheel - bicycleTire;
        int tricycle = tricycleTire/3;
        System.out.println("There are " + tricycle + " tricycles.");
    }
}
