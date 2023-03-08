package adapter;

public class Mp3Player implements Player{

    public void play(String filepath){
        System.out.println("Playing the mp3 file"+filepath);
    }
}
