package org.experiments;

/**
 * Created by kisik on 13.08.2017.
 */
class NewLine {
    public static Double addsomething(Double input){
        Double result = input + 10;
        return result;
    }

    public static void newLine() {
        System.out.println("");
    }

    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] arguments) {
        System.out.println("Line 1");
        threeLines ();
        System.out.println("Line 2");

        Double originalNumber = 15.0d;
        Double result = addsomething(originalNumber);
        System.out.println(result);
    }
}
