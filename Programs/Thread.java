package Practice;

import jdk.internal.math.FormattedFloatingDecimal;

import java.io.IOException;
import java.io.*;
import java.util.*;

import java.util.ArrayList;

import java.lang.Thread.*;


class thread1 implements Runnable{



    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" : " + i);
        }
    }

}
public class Main {



    public static void main(String[] args) {
        System.out.println("***********************Thread******************");


    Runnable r = new thread1();
    Thread thx = new Thread(r);
    thx.start();

    Runnable r1 = new thread1();
    Thread thx1 = new Thread(r1);
    thx1.start();

        Runnable r2 = new thread1();
        Thread thx2 = new Thread(r1);
        thx2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" : " + i);
        }









    }
}