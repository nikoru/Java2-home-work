package com.geekbrains.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneDict {
    private final HashMap<String, ArrayList<String>> dict = new HashMap<String, ArrayList<String>>();

    public void add(String surname, String tel){
        dict.putIfAbsent(surname,new ArrayList<String>());
        dict.get(surname).add(tel);
    }

    public void get(String surname){
        if (dict.get(surname)!=null)
        System.out.println("Telephone(-s) for "+ surname+ " - " +dict.get(surname));
        else System.out.println("Telephone(-s) for "+ surname+ " - not found");
    }
}
