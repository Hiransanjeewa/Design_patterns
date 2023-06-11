package Adapterr;

public class Mp4Player implements Player{
    public void play(String filepath){
        System.out.println("Playing the Mp4 file -> "+filepath);
    }
}
