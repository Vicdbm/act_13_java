package com.company;

import java.util.Comparator;

public class SortByAlfabeto implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}