package org.experiments;

import java.util.Arrays;

/**
 * Created by kisik on 19.08.2017.
 */
public class supervalues {
    public static void main(String[] args) {
        int myArray[] = new int[4];
        myArray[0] = 12;
        myArray[1] = 44;
        myArray[2] = 88;
        myArray[3] = 18;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("ny number is " + myArray[i]);
        }

        int i = 0;
        while (i < myArray.length) {
            i++;
        }
        System.out.println(" -- ");
        System.out.println(Arrays.toString(myArray));
       /* for (int row = 0; row < 10; row++){
            for (int column = 0; column < 10; column++) {
             //  System.out.println("row = " + row + "; column = " + column);
                System.out.println(row * column);}*/

    }
}

