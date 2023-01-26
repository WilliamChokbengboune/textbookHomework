/**
 * Class: SpeedLight
 * Author: William Chokbengboune
 * Written: January 26th, 2023
 * Course: ITEC 2140 section 04
 * Version: 1.0
 * Description: This file calculates the speed of light.
 */

public class SpeedLight {
    public static void main(String[] args){
        int speed = 340; // speed of sound is 340 meters per second
        int time = 5; //amount of time between lightning heard and seen
        int distance = speed/time;
        System.out.println(distance);

    }
}
