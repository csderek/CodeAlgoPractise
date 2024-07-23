import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int temp = 5527;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            //System.err.println("temp: " + temp);
            //System.err.println("t: " + t);
            //System.err.println("Math.abs(0 - t): " + Math.abs(0 - t));
            if (Math.abs(0 - t) < Math.abs(temp)){
                temp = t;
            }else if(Math.abs(0 - t) == Math.abs(temp) && t > 0){
                temp = t;
            }
        }
        if (temp == 5527){
            temp = 0;
        } 

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(temp);
    }
}