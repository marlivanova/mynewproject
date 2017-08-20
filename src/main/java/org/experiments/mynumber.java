package org.experiments;

import java.util.Arrays;

/**
 * Created by kisik on 19.08.2017.
 */
public class mynumber {
    public static void main(String[] args) {
        int len = args.length;
        Integer toSort[] = new Integer[len];

        for (int i = 0; i < args.length; i++) {
            toSort[i] = Integer.valueOf(args[i]);
        }
        System.out.println(Arrays.toString(toSort));
        Arrays.sort(toSort);
        System.out.println(Arrays.toString(toSort));

       // System.out.println("the biggest number is: " + toSort[len-1]);
    }
}



