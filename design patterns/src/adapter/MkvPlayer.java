package adapter;

public class MkvPlayer implements Player{
    public void play(String filepath){
        System.out.println("Playing the mkv file"+filepath);
    }
}
