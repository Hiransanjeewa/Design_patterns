package Adapterr;

public class MkvPlayer implements Player{



    public void play(String filepath) {
        System.out.println("Playing the Mkv file -> "+filepath);
    }
}
