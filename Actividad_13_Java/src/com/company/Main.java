package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List myList = new ArrayList(); //creando la lista

        //agregando los elementos
        myList.add("a");
        myList.add("ccc");
        myList.add("yyyy");
        myList.add("eeeee");
        myList.add("vvvvvvvvvv");
        myList.add("ggggggg");
        myList.add("wwwwwwww");
        myList.add("iiiiiiiii");
        myList.add("xxxxxx");
        myList.add("zz");

        //Por longitud utilizando clase anónima.
        myList.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length()-b.length();
            }
        });

        System.out.println("Ordenado por longitud con clase anónima:");
        for (int i=0; i<10; i++) {
            System.out.println(myList.get(i));
        }

        //Por orden alfabético utilizando clase anónima.
        myList.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println("\nOrdenado alfabeticamente con clase anónima:");
        for (int i=0; i<10; i++) {
            System.out.println(myList.get(i));
        }

        //Por longitud utilizando expresión lambda.
        SortByLongitud longi = new SortByLongitud();
        ConvertInterface convertirLong = (a) -> a.sort(longi);

        convertirLong.convertMethod(myList);

        System.out.println("\nOrenado por longitud con expresión lambda");
        for (int i=0; i<10; i++) {
            System.out.println(myList.get(i));
        }

        //Por orden alfabético utilizando expresión Lambda.
        SortByAlfabeto alfab = new SortByAlfabeto();
        ConvertInterface convertirAlfab = (a) -> a.sort(alfab);

        convertirAlfab.convertMethod(myList);

        System.out.println("\nOrdenado por alfabeto con expresión lambda");
        for (int i=0; i<10; i++) {
            System.out.println(myList.get(i));
        }

        //Por longitud utilizando método de referencia.
        ConvertInterface longMetRef = StaticSortByLongitud::sortLong;

        longMetRef.convertMethod(myList);

        System.out.println("\nOrdenado por longitud con método de referencia");
        for (int i=0; i<10; i++) {
            System.out.println(myList.get(i));
        }

        //Por orden alfabético utilizando método de referencia.
        ConvertInterface alfabMetRef = StaticSortByAlfabeto::sortAlf;

        alfabMetRef.convertMethod(myList);

        System.out.println("\nOrdenado por alfabeto con método de referencia");
        for (int i=0; i<10; i++) {
            System.out.println(myList.get(i));
        }
    }
}
