package com.singleton;

public class Main {
    public static void main(String[] args) {

        Clipboard clipboard1=Clipboard.getInstance();
        Clipboard clipboard2= Clipboard.getInstance();

        clipboard1.copy("A");
        clipboard2.copy("B");

        // Both names are referencing to one object
        // ??? Connection pooling
        System.out.println(clipboard1.paste());
        System.out.println(clipboard2.paste());

        clipboard1.copy("C");
        System.out.println(clipboard1.paste());
        System.out.println(clipboard2.paste());

    }
}