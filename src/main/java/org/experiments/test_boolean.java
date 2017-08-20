package org.experiments;

/**
 * Created by kisik on 19.08.2017.
 */
public class test_boolean {
    public static void main(String[] args) {
        boolean maVar = false;
        String word1 = "kotek";
        String word2 = "plotek";

        System.out.println(word1 == word2);

        System.out.println(word2.compareTo(word1));
        System.out.println(word1.compareTo(word2));
        System.out.println(word1.equals(word2));

        Integer num1 = 12;
        Integer num2 = 16;
        System.out.println(num1 > num2);
    }
}
