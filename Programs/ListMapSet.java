package Practice;

import jdk.internal.math.FormattedFloatingDecimal;

import java.io.IOException;
import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("************************************ARRAY LIST***************************************************");
        ArrayList<Integer> al = new ArrayList<Integer>(20);

        al.add(1);
        al.add(2);
        al.add(6);
        al.add(4);
        al.add(9);
        al.add(6);
        al.add(2);
        al.add(1);
        al.add(6);
        al.add(7);
        System.out.println(al);
        //Collections.sort(al);
        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("************************************LINKED LIST***************************************************");


        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(6);
        ll.add(4);
        ll.add(9);
        ll.add(6);
        ll.add(2);
        ll.add(1);
        ll.add(6);
        ll.add(7);
        Boolean A = ll.contains(94);
        System.out.println(A);
        System.out.println(ll);
        //Collections.sort(ll);
        Iterator<Integer> it1 = ll.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }


        System.out.println("************************************HASH SET***************************************************");

        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(1);
        hs.add(2);
        hs.add(6);
        hs.add(4);
        hs.add(9);
        hs.add(6);
        hs.add(2);
        hs.add(1);
        hs.add(6);
        hs.add(7);

        System.out.println(hs);
        //Collections.sort(ll);
        Iterator<Integer> it2 = hs.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("************************************HASHMAP***************************************************");

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"India");
        hm.put(2,"USA");
        hm.put(3,"Canada");

        HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
        hm.put(1,"India");
        hm.put(2,"USA");
        hm.put(3,"Canada");

        String z = hm.get(1);
        System.out.println(z);

        System.out.println(hm);

        for(HashMap.Entry<Integer,String> e: hm.entrySet()){
          System.out.println(e.getKey() +" " +e.getValue());

        }
        System.out.println("************************************TREEMAP***************************************************");
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"India");
        tm.put(2,"USA");
        tm.put(3,"Canada");



        String z1 = tm.get(1);
        System.out.println(z1);

        System.out.println(tm);


        Set<Map.Entry<Integer,String>> e1 = tm.entrySet();
        Map.Entry<Integer,String> [] entArray = e1.toArray(new Map.Entry[e1.size()]);

        for (int i = 0; i < 3; i++)
        {

            System.out.println("Key at " + i + ":"
                    + entArray[i].getKey());

            System.out.println("Value at " + i + ":"
                    + entArray[i].getValue());
        }







        



    }
}
