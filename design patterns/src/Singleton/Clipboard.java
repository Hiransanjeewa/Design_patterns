package Singleton;

public class Clipboard {

    private String content;
    private static Clipboard instance;

    // First way - create private constructor to the class
    private Clipboard(){ // this can be accessed from the class itself

    }

    // Create a method to get an object from this class
    public static Clipboard getInstance(){
        if (instance==null){
            instance=new Clipboard();
        }
        return instance;
    }

    // How to implement copy function for this clipboard class
    public void copy(String data){
        this.content=data;
    }

    public String paste(){
        return content;
    }


}
