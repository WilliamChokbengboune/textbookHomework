/**
 * Class: SpeedLight
 * Author: William Chokbengboune
 * Written: January 26th, 2023
 * Course: ITEC 2140 section 04
 * Version: 1.0
 * Description: This file calculates the speed of light.
 */

import java.util.Scanner;

public class SpeedLight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int speed = 340; // speed of sound is 340 meters per second
        System.out.println("Enter distance: ");
        int time = input.nextInt(); //amount of time between lightning heard and seen
        int distance = speed * time;
        System.out.println("Speed of light has traveled " + distance + " meters.");

    }
}
