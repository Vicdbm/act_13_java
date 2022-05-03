package com.company;

import java.util.List;

public class StaticSortByLongitud {
    static void sortLong(List<String> a) {
        SortByLongitud sortLongi = new SortByLongitud();
        a.sort(sortLongi);
    }
}
