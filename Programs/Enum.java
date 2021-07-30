package Practice;

import jdk.internal.math.FormattedFloatingDecimal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

enum COUNTRY {
    INDIA, USA, UK, CANADA;
}


public class Main {

    COUNTRY country;

    public Main(COUNTRY country){
        this.country  = country;
    }

    public void test ()
    {
        int count = 0;
        switch(country) {
            case INDIA:
                System.out.println("Bharat");

                break;
            case USA:
                System.out.println("US");

                break;

            case UK:
                System.out.println("KINGDOM");

                break;
            case CANADA:
                System.out.println("VISA");



                break;
        }

    }


    public static void main(String args[]) {

        String value = "INDIA";
        String value1 = "USA";
        String value2 = "UK";
        String value3 = "CANADA";
        Main nation = new Main(COUNTRY.valueOf(value));

        nation.test();

        Main nation1 = new Main(COUNTRY.valueOf(value1));

        nation1.test();
        nation.test();

        Main nation2 = new Main(COUNTRY.valueOf(value2));

        nation2.test();

        Main nation3 = new Main(COUNTRY.valueOf(value3));
        nation3.test();

    }
}
