package ru.mirea.ikbo1120.sheloumov.Classes;

import java.util.ArrayList;

public class ArrayToList {
    public static <E> void toList(E[] a, ArrayList<E> lst)
    {
        for (E e : a)
        {
            lst.add(e);
        }
    }
}