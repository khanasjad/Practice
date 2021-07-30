package Practice;

import jdk.internal.math.FormattedFloatingDecimal;

import java.io.IOException;
import java.io.*;
import java.util.*;

import java.util.ArrayList;

System.out.println("***********************Singleton******************")
class Abc{
    static Abc obj = new Abc();

    private Abc(){

    }

    static Abc getInstance(){
        return obj;
    }
}
public class Main {

    public static void main(String[] args) {

     Abc abc = Abc.getInstance();
     Abc abc1 = Abc.getInstance();



    }
}
