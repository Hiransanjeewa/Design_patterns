package com.singleton;


// Try to make this class singleton
public class Clipboard {
    public String content;
    private static Clipboard instance;
    
    // Create a private constructer
    private Clipboard(){  // can't access from outside

    }
    // Create a method to create a object in this class
    public static Clipboard getInstance(){

        if (instance==null){
            instance= new Clipboard();

        }return instance;

    }
    public void copy (String newcontent){
        this.content=newcontent;
    }
    public String paste (){
        return this.content;
    }

}
