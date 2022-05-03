package com.company;

import java.util.Comparator;

public class SortByLongitud implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return a.length()-b.length();
    }
}