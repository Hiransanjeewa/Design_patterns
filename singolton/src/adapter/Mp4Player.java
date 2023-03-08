package adapter;

public class Mp4Player implements Player {
    public void play(String filepath){
        System.out.println("Playing the mp4 file"+filepath);
    }
}
