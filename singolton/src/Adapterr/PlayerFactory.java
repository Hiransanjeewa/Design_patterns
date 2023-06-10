package Adapterr;

public class PlayerFactory {

    // Factory design pattern
    public Player getInstance(String filename){
        Player player=null;
        if (filename.endsWith(".mp3")){
            player=new Mp3Player();
        } else if (filename.endsWith(".mp4")) {
            player=new Mp4Player();
        }else if (filename.endsWith(".mkv")) {
            player=new MkvPlayer();
        }else if (filename.endsWith(".img")) {
          //  player=new ImageViewer();// class is incompatible , to sort out this problem we can use an image adapter
            player=new ImageAdapter();
        }
        return player;
    }
}
