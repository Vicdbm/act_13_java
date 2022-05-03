package com.company;

import java.util.List;

public class StaticSortByAlfabeto {
    static void sortAlf(List<String> a) {
        SortByAlfabeto sortAlfab = new SortByAlfabeto();
        a.sort(sortAlfab);
    }
}
