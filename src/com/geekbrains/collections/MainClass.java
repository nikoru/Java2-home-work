package com.geekbrains.collections;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
      //Task 1
       String[] arrString = {"Apple", "Google", "Apple", "BMW", "Mercedes", "BMW", "Coca-Cola", "Pepsi", "Pepsi", "BMW"};

       List <String> arrList = Arrays.asList(arrString);
       System.out.println(arrList);

       TreeSet<String> treeString = new TreeSet<>(arrList);
       System.out.println(treeString); //Unique dataset

       HashMap<String, Integer> hashList = new HashMap<>(); //store frequency for each word

        for(String iter : treeString){
            int count = Collections.frequency(arrList,iter);
            hashList.put(iter,count);
        }
        System.out.println(hashList);

        //Task 2
        TelephoneDict td = new TelephoneDict();
        td.add("Ivanov","899933");
        td.add("Ivanov","903242");
        td.add("Ivanov","64532");
        td.add("Smirnov","354535");
        td.add("Sidorov","99899");
        td.get("Ivanov");
        td.get("Smirnov");
        td.get("MMMMM");
    }

}

