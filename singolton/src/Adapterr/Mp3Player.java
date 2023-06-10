package Adapterr;

public class Mp3Player implements Player{
    public void play(String filepath){
        System.out.println("Playing the Mp3 file -> "+filepath);
    }
}
