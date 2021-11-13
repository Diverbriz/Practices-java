package ru.mirea.ikbo1120.sheloumov;

import ru.mirea.ikbo1120.sheloumov.Classes.*;

public class Main {



    public static void main(String[] args) {
        String str = "It's a string; ";
        System.out.println(str + Exercise8(0,str.length() - 1, str));
        str = "aboba; ";
        System.out.println(str + Exercise8(0,str.length() - 1, str));
        System.out.println(Exercise9(1, 2 ));
        Exercise10(12345678);
    }
}