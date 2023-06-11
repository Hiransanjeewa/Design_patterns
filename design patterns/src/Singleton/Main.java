package Singleton;

public class Main {
    public static void main(String[] args) {

        Clipboard clipboard1= Clipboard.getInstance();
        Clipboard clipboard2= Clipboard.getInstance();

        clipboard1.copy("A");
        clipboard2.copy("B");
        System.out.println(clipboard1.paste());
        System.out.println(clipboard2.paste());

        clipboard1.copy("C");
        clipboard2.copy("D");
        System.out.println(clipboard1.paste());
        System.out.println(clipboard2.paste());
    }
}
