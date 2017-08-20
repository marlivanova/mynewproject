package org.experiments;

import static org.experiments.AnotherClass.*;

/**
 * Created by kisik on 13.08.2017.
 */
public class NewClass {

    public static void main(String[] args) {

        MyFirstClass myFirstClass = new MyFirstClass();
        System.out.println(myFirstClass.toString());

        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.toString());

        MyFirstClass myFirstClassCopy = myFirstClass;
        System.out.println(myFirstClassCopy.toString());

        myFirstClass.setNumber(10);
        System.out.println(myFirstClassCopy.getNumber());

    }

       /* String values[] = {"Adam", "Bob", "Mary"};

        for (String value : values) {
            System.out.println(value);
        }

        values[1] = null;

        for (String value : values) {
            if (value != null)
                System.out.println(value.toUpperCase());*/



       /* MyFirstClass kaka = null;

        System.out.println(MyFirstClass.getName());

        AnotherClass.setAnotherNumber(23);
        System.out.println(AnotherClass.getAnotherNumber());

        AnotherClass firstInstance = new AnotherClass();
        firstInstance.setAnotherNumber(1);
        AnotherClass secondInstance = new AnotherClass();
        secondInstance.setAnotherNumber(2);

        System.out.println(firstInstance.getAnotherNumber());
        System.out.println(secondInstance.getAnotherNumber());*/



       /* MyFirstClass myFirstClass = new MyFirstClass();
        System.out.println(myFirstClass.toString());

        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.toString());

        MyFirstClass myFirstClassCopy = myFirstClass;
        System.out.println(myFirstClassCopy.toString());

        myFirstClass.setNumber(10);
        System.out.println(myFirstClassCopy.getNumber());*/


}

