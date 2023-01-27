/**
 * Class: MaleStudent
 * Author: William Chokbengboune
 * Written: January 27, 2023
 * Course: ITEC 2140 section 04
 * Version: 1.0
 * This program is meant to print the number of male students.
 */

public class MaleStudent {
    public static void main(String[] args){
        int totalStudent = 389;
        int femaleStudent = 175;
        int maleStudent = totalStudent - femaleStudent;
        System.out.println("There are " + maleStudent + " male students.");
    }
}
